package com.property.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 缴费单
 * </p>
 *
 * @author 
 */

@Data
@ApiModel(value="Payment对象", description="缴费单")
public class Payment implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "账单编号")
      private Integer p_id;

    @ApiModelProperty(value = "业主id")
    private Integer p_owner_id;

    @ApiModelProperty(value = "缴费状态")
    private String p_status;

    @ApiModelProperty(value = "缴费时间")
    private Date p_time;

    @ApiModelProperty(value = "金额")
    private String p_cost;

    @ApiModelProperty(value = "备注")
    private String p_note;


    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public Integer getP_owner_id() {
        return p_owner_id;
    }

    public void setP_owner_id(Integer p_owner_id) {
        this.p_owner_id = p_owner_id;
    }

    public String getP_status() {
        return p_status;
    }

    public void setP_status(String p_status) {
        this.p_status = p_status;
    }

    public Date getP_time() {
        return p_time;
    }

    public void setP_time(Date p_time) {
        this.p_time = p_time;
    }

    public String getP_cost() {
        return p_cost;
    }

    public void setP_cost(String p_cost) {
        this.p_cost = p_cost;
    }

    public String getP_note() {
        return p_note;
    }

    public void setP_note(String p_note) {
        this.p_note = p_note;
    }

    @Override
    public String toString() {
        return "Payment{" +
        "p_id=" + p_id +
        ", p_owner_id=" + p_owner_id +
        ", p_status=" + p_status +
        ", p_time=" + p_time +
        ", p_cost=" + p_cost +
        ", p_note=" + p_note +
        "}";
    }
}
