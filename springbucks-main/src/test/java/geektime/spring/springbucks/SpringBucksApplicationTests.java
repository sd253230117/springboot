package geektime.spring.springbucks;

import geektime.spring.springbucks.exception.RollbackException;
import geektime.spring.springbucks.mapper.OrderMapper;
import geektime.spring.springbucks.pojo.CoffeePojo;
import geektime.spring.springbucks.pojo.CoffeePojoAn;
import geektime.spring.springbucks.pojo.Order;
import geektime.spring.springbucks.pojo.OrderExample;
import geektime.spring.springbucks.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableTransactionManagement
@EnableCaching(proxyTargetClass = true)
public class SpringBucksApplicationTests  {
	@Resource
	OrderService orderService;

	@Autowired
	OrderMapper orderMapper;

	@Autowired
	CoffeePojoAn coffeePojoAn;

	@Autowired
	private RedisTemplate redisTemplate;
	@Test
	public void contextLoads() {
	}

	@Test
	public void TestBean() {
		//使用xml装配
		ApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//构造方法
		CoffeePojo userByConstructor = xmlApplicationContext.getBean("CoffeePojo",CoffeePojo.class);
		log.info(userByConstructor.getName());


	}

	//@Test
	public void TestAll() {

		queryTest(2L,true);//缓存到redis
		log.info("redis缓存测试");
		queryTest(2L,true);//查询
		log.info("开始更新");
		try {
			updateTest();
		} catch (Exception e) {
			log.error("调用updateTest失败：",e);
			// TODO: handle exception
		}
		try {
			Thread.sleep(10000);
		}catch (Exception e) {
			log.error("调用updateTest失败：",e);
			// TODO: handle exception
		}
		log.info("redis缓存测试");
		queryTest(2L,false);
		log.info("新建测试");
		try {
			createTest();
		}catch (Exception e) {
			log.error("调用createTest失败：",e);
			// TODO: handle exception
		}

		log.info("分页测试");
		pageTest();

		log.info("根据id批量查询测试");
		queryByIdsTest();
		log.info("删除测试");
		deleteTest();
	}




	private void queryTest(Long id,boolean cache){
		Order byId = orderService.getById(id,cache);
		log.info("根据id={}查询订单,结果为:{}",id,byId);
		log.info("查询缓存");
		//Set<String> keys = redisTemplate.keys("order_cache");

			String str3 = (String) redisTemplate.opsForValue().get("der_cache::1,6");

		//log.info(keys.toString());
		log.info(str3);
	}


	private void createTest() throws RollbackException {
		Order order = Order.builder ()
				.customer("咖啡")
				.createTime(new Date())
				.updateTime(new Date())
				.state(1)
				.build();
		log.info("所有订单数量:{}",orderMapper.selectByExample(new OrderExample()).size());
		Order param = Order.builder().customer("咖啡").build();
		log.info("query order param:{}",param);

		log.info("新建订单,结果为:{}",orderService.create(order));

		log.info("所有订单数量:{}",orderMapper.selectByExample(new OrderExample()).size());

	}

	private void updateTest() throws RollbackException {
		Order byId = orderService.getById(2L,true);

		Order order = Order.builder()
				.customer(byId.getCustomer())
				.id(byId.getId())
				.state(4)
				.build();
		log.info("更新订单,结果为:{}",orderService.updateById(order));
		log.info("所有订单:{}",orderMapper.selectByExample(new OrderExample()));
	}


	private void pageTest(){
		log.info("分页查询结果:{}",orderService.listOrderByPage(1,3));
	}

	private void queryByIdsTest(){
		List<Long> ids = Arrays.asList(1L, 6L);
		log.info("根据主键批量查询结果:{}",orderService.selectByIds(ids));
	}

	private void deleteTest(){
		log.info("所有订单数量:{}",orderMapper.selectByExample(new OrderExample()).size());
		log.info("根据主键删除结果:{}",orderService.deleteById(3L));
		log.info("所有订单数量:{}",orderMapper.selectByExample(new OrderExample()).size());
	}

}

