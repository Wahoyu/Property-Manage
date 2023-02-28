package com.property.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 当班人员
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */

@Data
@ApiModel(value="Worker对象", description="当班人员")
public class Worker implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "工人编号")
      private Integer w_id;

    @ApiModelProperty(value = "工人名字")
    private String w_name;

    @ApiModelProperty(value = "工人年龄")
    private String w_age;

    @ApiModelProperty(value = "工人电话")
    private String w_tele;

    @ApiModelProperty(value = "用户名")
    private String w_username;

    @ApiModelProperty(value = "密码")
    private String w_password;


    public Integer getW_id() {
        return w_id;
    }

    public void setW_id(Integer w_id) {
        this.w_id = w_id;
    }

    public String getW_name() {
        return w_name;
    }

    public void setW_name(String w_name) {
        this.w_name = w_name;
    }

    public String getW_age() {
        return w_age;
    }

    public void setW_age(String w_age) {
        this.w_age = w_age;
    }

    public String getW_tele() {
        return w_tele;
    }

    public void setW_tele(String w_tele) {
        this.w_tele = w_tele;
    }

    public String getW_username() {
        return w_username;
    }

    public void setW_username(String w_username) {
        this.w_username = w_username;
    }

    public String getW_password() {
        return w_password;
    }

    public void setW_password(String w_password) {
        this.w_password = w_password;
    }

    @Override
    public String toString() {
        return "Worker{" +
        "w_id=" + w_id +
        ", w_name=" + w_name +
        ", w_age=" + w_age +
        ", w_tele=" + w_tele +
        ", w_username=" + w_username +
        ", w_password=" + w_password +
        "}";
    }
}
