package com.property.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 报修单
 * </p>
 *
 * @author 
 */

@Data
@ApiModel(value="Repair_form对象", description="报修单")
public class Repair_form implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "报修单编号")
      private Integer r_id;

    @ApiModelProperty(value = "报修时间")
    private Date r_time;

    @ApiModelProperty(value = "业主信息")
    private String r_owner_id;

    @ApiModelProperty(value = "报修原因")
    private String r_reason;

    @ApiModelProperty(value = "预约解决时间")
    private Date r_date;

    @ApiModelProperty(value = "报修状态")
    private String r_status;


    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public Date getR_time() {
        return r_time;
    }

    public void setR_time(Date r_time) {
        this.r_time = r_time;
    }

    public String getR_owner_id() {
        return r_owner_id;
    }

    public void setR_owner_id(String r_owner_id) {
        this.r_owner_id = r_owner_id;
    }

    public String getR_reason() {
        return r_reason;
    }

    public void setR_reason(String r_reason) {
        this.r_reason = r_reason;
    }

    public Date getR_date() {
        return r_date;
    }

    public void setR_date(Date r_date) {
        this.r_date = r_date;
    }

    public String getR_status() {
        return r_status;
    }

    public void setR_status(String r_status) {
        this.r_status = r_status;
    }

    @Override
    public String toString() {
        return "Repair_form{" +
        "r_id=" + r_id +
        ", r_time=" + r_time +
        ", r_owner_id=" + r_owner_id +
        ", r_reason=" + r_reason +
        ", r_date=" + r_date +
        ", r_status=" + r_status +
        "}";
    }
}
