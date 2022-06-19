package geektime.spring.springbucks.pojo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
public class CoffeePojo implements Serializable {

    private Long id;


    private Date createTime;


    private Date updateTime;

    private String name;


    private static final long serialVersionUID = 1L;

    public CoffeePojo(String context) {
    }



    public Long getId() {
        return id;
    }


    public CoffeePojo withId(Long id) {
        this.setId(id);
        return this;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Date getCreateTime() {
        return createTime;
    }


    public CoffeePojo withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


    public Date getUpdateTime() {
        return updateTime;
    }

    public CoffeePojo withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }


    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return name;
    }


    public CoffeePojo withName(String name) {
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