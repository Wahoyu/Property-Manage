package com.property.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 通知条
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */

@Data
@ApiModel(value="Inform对象", description="通知条")
public class Inform implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "通知编号")
    private Integer i_id;

    @ApiModelProperty(value = "通知等级")
    private String i_level;

    @ApiModelProperty(value = "通知发布时间")
    private Date i_time;

    @ApiModelProperty(value = "通知内容")
    private String i_content;


    public Integer getI_id() {
        return i_id;
    }

    public void setI_id(Integer i_id) {
        this.i_id = i_id;
    }

    public String getI_level() {
        return i_level;
    }

    public void setI_level(String i_level) {
        this.i_level = i_level;
    }

    public Date getI_time() {
        return i_time;
    }

    public void setI_time(Date i_time) {
        this.i_time = i_time;
    }

    public String getI_content() {
        return i_content;
    }

    public void setI_content(String i_content) {
        this.i_content = i_content;
    }

    @Override
    public String toString() {
        return "Inform{" +
        "i_id=" + i_id +
        ", i_level=" + i_level +
        ", i_time=" + i_time +
        ", i_content=" + i_content +
        "}";
    }
}
