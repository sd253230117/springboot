package geektime.spring.springbucks.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.money.Money;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeStatic implements Serializable {

    private Long id;


    private Date createTime;


    private Date updateTime;

    private String name;

    private Money price;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }


    public CoffeeStatic withId(Long id) {
        this.setId(id);
        return this;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Date getCreateTime() {
        return createTime;
    }


    public CoffeeStatic withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public CoffeeStatic withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }


    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }


    public CoffeeStatic withName(String name) {
        this.setName(name);
        return this;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public Money getPrice() {
        return price;
    }


    public CoffeeStatic withPrice(Money price) {
        this.setPrice(price);
        return this;
    }

    public void setPrice(Money price) {
        this.price = price;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append("]");
        return sb.toString();
    }

    public static CoffeeStatic createCoffeeStatic(Money money){
        CoffeeStatic coffeeStatic = new CoffeeStatic();
        coffeeStatic.setId(2L);
        coffeeStatic.setName("静态方法装配");
        coffeeStatic.setPrice(money);
        return coffeeStatic;
    }
}