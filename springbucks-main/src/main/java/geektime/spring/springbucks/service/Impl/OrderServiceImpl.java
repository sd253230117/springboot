package geektime.spring.springbucks.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import geektime.spring.springbucks.exception.RollbackException;
import geektime.spring.springbucks.mapper.OrderMapper;
import geektime.spring.springbucks.pojo.Order;
import geektime.spring.springbucks.pojo.OrderExample;
import geektime.spring.springbucks.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.List;

@Slf4j
@Service
@CacheConfig(cacheNames = "order_cache")
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;


    @Override
    @Transactional(rollbackFor = RollbackException.class)
    public int create(Order order) throws RollbackException {
        return orderMapper.insert(order);
    }

    @Override
    @Cacheable(cacheNames = "order_cache",key ="'getById'+#id",condition = "#cache")
    public Order getById(Long id,boolean cache) {
        log.info("获取数据");
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    @Cacheable
    public List<Order> selectByIds(Collection<Long> ids) {
        OrderExample orderExample = new OrderExample();
        OrderExample.Criteria criteria = orderExample.createCriteria();
        criteria.andIdIn((List<Long>) ids);
        return orderMapper.selectByExample(orderExample);
    }


    @Override
    public PageInfo listOrderByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Order> orders = orderMapper.selectByExample(new OrderExample());
        return new PageInfo<>(orders);
    }

    @Override
    @Transactional(rollbackFor = RollbackException.class)
    @CacheEvict
    public int deleteById(Long id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(rollbackFor = RollbackException.class)
    @CacheEvict
    public int updateById(Order order) {
        return orderMapper.updateByPrimaryKeySelective(order);
    }



/*    @Override
    public PageInfo listOrderByPageOrderBy(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Order> orders = orderMapper.selectByExampleOrderBy(new OrderExample());
        return new PageInfo<>(orders);
    }*/


}
