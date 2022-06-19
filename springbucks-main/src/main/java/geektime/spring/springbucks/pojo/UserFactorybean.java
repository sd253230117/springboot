package geektime.spring.springbucks.pojo;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by fang on 2022/6/19.
 */
public class UserFactorybean implements FactoryBean {
    @Override
    public Object getObject() throws Exception{
        CoffeePojo coffeePojo = new CoffeePojo();
        coffeePojo.setId(9L);
        coffeePojo.setName("FactoryBean装配");
        return coffeePojo;
    }

    @Override
    public Class<?> getObjectType(){
        return Coffee.class;
    }
}
