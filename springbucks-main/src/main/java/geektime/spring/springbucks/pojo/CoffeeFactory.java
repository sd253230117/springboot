package geektime.spring.springbucks.pojo;

import org.joda.money.Money;

/**
 * Created by fang on 2022/6/19.
 */
public interface CoffeeFactory {
    default CoffeePojo createCoffee(Money money){
        CoffeePojo coffeePojo = new CoffeePojo( );
        coffeePojo.setName("实例方法装配");
        coffeePojo.setId(7L);
        return  coffeePojo;
    }
}
