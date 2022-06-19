package geektime.spring.springbucks.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Component("CoffeePojoAn")
public class CoffeePojoAn implements Serializable {

    private Long id;


    private Date createTime;


    private Date updateTime;

    private String name;


    private static final long serialVersionUID = 1L;

    public CoffeePojoAn(String context) {
    }



    public Long getId() {
        return id;
    }


    public CoffeePojoAn withId(Long id) {
        this.setId(id);
        return this;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Date getCreateTime() {
        return createTime;
    }


    public CoffeePojoAn withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public CoffeePojoAn withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }


    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }


    public CoffeePojoAn withName(String name) {
        this.setName(name);
        return this;
    }


    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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
        sb.append("]");
        return sb.toString();
    }

}