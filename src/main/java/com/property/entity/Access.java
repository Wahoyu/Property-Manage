package com.property.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 安全通道
 * </p>
 *
 * @author 
 */
@Data
@ApiModel(value="Access对象", description="安全通道")
public class Access implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "安全通道id")
    private Integer a_id;

    @ApiModelProperty(value = "安全通道名字")
    private String a_name;

    @ApiModelProperty(value = "安全通道状态")
    private String a_status;


    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_status() {
        return a_status;
    }

    public void setA_status(String a_status) {
        this.a_status = a_status;
    }

    @Override
    public String toString() {
        return "Access{" +
        "a_id=" + a_id +
        ", a_name=" + a_name +
        ", a_status=" + a_status +
        "}";
    }
}
