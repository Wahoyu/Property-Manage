package com.property.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 排班表
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */

@Data
@ApiModel(value="Duty对象", description="排班表")
public class Duty implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "值班编号")
    private Integer d_id;

    @ApiModelProperty(value = "值班时间")
    private Date d_time;

    @ApiModelProperty(value = "值班人员id")
    private Integer d_worker_id;

    @ApiModelProperty(value = "值班内容")
    private String d_content;


    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public Date getD_time() {
        return d_time;
    }

    public void setD_time(Date d_time) {
        this.d_time = d_time;
    }

    public Integer getD_worker_id() {
        return d_worker_id;
    }

    public void setD_worker_id(Integer d_worker_id) {
        this.d_worker_id = d_worker_id;
    }

    public String getD_content() {
        return d_content;
    }

    public void setD_content(String d_content) {
        this.d_content = d_content;
    }

    @Override
    public String toString() {
        return "Duty{" +
        "d_id=" + d_id +
        ", d_time=" + d_time +
        ", d_worker_id=" + d_worker_id +
        ", d_content=" + d_content +
        "}";
    }
}
