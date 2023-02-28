package com.property.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 超级管理员
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */

@Data
@ApiModel(value="Admin对象", description="超级管理员")
public class Admin implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "超级管理员id")
      private Integer a_id;

    @ApiModelProperty(value = "账户")
    private String a_username;

    @ApiModelProperty(value = "密码")
    private String a_password;


    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_username() {
        return a_username;
    }

    public void setA_username(String a_username) {
        this.a_username = a_username;
    }

    public String getA_password() {
        return a_password;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
    }

    @Override
    public String toString() {
        return "Admin{" +
        "a_id=" + a_id +
        ", a_username=" + a_username +
        ", a_password=" + a_password +
        "}";
    }
}
