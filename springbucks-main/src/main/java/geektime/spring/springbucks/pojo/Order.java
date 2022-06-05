package geektime.spring.springbucks.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@Builder
public class Order implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ORDER.ID
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ORDER.CREATE_TIME
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ORDER.UPDATE_TIME
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ORDER.CUSTOMER
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    private String customer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_ORDER.STATE
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    private Integer state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ORDER
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ORDER.ID
     *
     * @return the value of T_ORDER.ID
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ORDER
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public Order withId(Long id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ORDER.ID
     *
     * @param id the value for T_ORDER.ID
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ORDER.CREATE_TIME
     *
     * @return the value of T_ORDER.CREATE_TIME
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ORDER
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public Order withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ORDER.CREATE_TIME
     *
     * @param createTime the value for T_ORDER.CREATE_TIME
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ORDER.UPDATE_TIME
     *
     * @return the value of T_ORDER.UPDATE_TIME
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ORDER
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public Order withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ORDER.UPDATE_TIME
     *
     * @param updateTime the value for T_ORDER.UPDATE_TIME
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ORDER.CUSTOMER
     *
     * @return the value of T_ORDER.CUSTOMER
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ORDER
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public Order withCustomer(String customer) {
        this.setCustomer(customer);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ORDER.CUSTOMER
     *
     * @param customer the value for T_ORDER.CUSTOMER
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_ORDER.STATE
     *
     * @return the value of T_ORDER.STATE
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ORDER
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public Order withState(Integer state) {
        this.setState(state);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_ORDER.STATE
     *
     * @param state the value for T_ORDER.STATE
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ORDER
     *
     * @mbg.generated Sun Jun 05 16:50:20 CST 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", customer=").append(customer);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}