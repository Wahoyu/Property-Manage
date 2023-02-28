package com.property.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 投诉条
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */

@Data
@ApiModel(value="Complain_form对象", description="投诉条")
public class Complain_form implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "投诉条编号")
      private Integer c_id;

    @ApiModelProperty(value = "投诉时间")
    private Date c_time;

    @ApiModelProperty(value = "投诉内容")
    private String c_content;

    @ApiModelProperty(value = "投诉业主")
    private String c_owner_id;

    @ApiModelProperty(value = "投诉状态")
    private String c_status;

    @ApiModelProperty(value = "投诉结果")
    private String c_result;


    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public Date getC_time() {
        return c_time;
    }

    public void setC_time(Date c_time) {
        this.c_time = c_time;
    }

    public String getC_content() {
        return c_content;
    }

    public void setC_content(String c_content) {
        this.c_content = c_content;
    }

    public String getC_owner_id() {
        return c_owner_id;
    }

    public void setC_owner_id(String c_owner_id) {
        this.c_owner_id = c_owner_id;
    }

    public String getC_status() {
        return c_status;
    }

    public void setC_status(String c_status) {
        this.c_status = c_status;
    }

    public String getC_result() {
        return c_result;
    }

    public void setC_result(String c_result) {
        this.c_result = c_result;
    }

    @Override
    public String toString() {
        return "Complain_form{" +
        "c_id=" + c_id +
        ", c_time=" + c_time +
        ", c_content=" + c_content +
        ", c_owner_id=" + c_owner_id +
        ", c_status=" + c_status +
        ", c_result=" + c_result +
        "}";
    }
}
