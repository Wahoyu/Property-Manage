package com.property.entity;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 业主
 * </p>
 *
 * @author 
 */

@Data
@ApiModel(value="Owner对象", description="业主")
public class Owner implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "业主编号")
      private Integer o_id;

    @ApiModelProperty(value = "业主姓名")
    private String o_name;

    @ApiModelProperty(value = "性别")
    private String o_sex;

    @ApiModelProperty(value = "联系电话")
    private String o_tele;

    @ApiModelProperty(value = "入住时间")
    private Date o_time;

    @ApiModelProperty(value = "账号")
    private String o_nickname;

    @ApiModelProperty(value = "密码")
    private String o_password;

    @ApiModelProperty(value = "车牌号")
    private String o_car_name;


    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public String getO_name() {
        return o_name;
    }

    public void setO_name(String o_name) {
        this.o_name = o_name;
    }

    public String getO_sex() {
        return o_sex;
    }

    public void setO_sex(String o_sex) {
        this.o_sex = o_sex;
    }

    public String getO_tele() {
        return o_tele;
    }

    public void setO_tele(String o_tele) {
        this.o_tele = o_tele;
    }

    public Date getO_time() {
        return o_time;
    }

    public void setO_time(Date o_time) {
        this.o_time = o_time;
    }

    public String getO_nickname() {
        return o_nickname;
    }

    public void setO_nickname(String o_nickname) {
        this.o_nickname = o_nickname;
    }

    public String getO_password() {
        return o_password;
    }

    public void setO_password(String o_password) {
        this.o_password = o_password;
    }

    public String getO_car_name() {
        return o_car_name;
    }

    public void setO_car_name(String o_car_name) {
        this.o_car_name = o_car_name;
    }

    @Override
    public String toString() {
        return "Owner{" +
        "o_id=" + o_id +
        ", o_name=" + o_name +
        ", o_sex=" + o_sex +
        ", o_tele=" + o_tele +
        ", o_time=" + o_time +
        ", o_nickname=" + o_nickname +
        ", o_password=" + o_password +
        ", o_car_name=" + o_car_name +
        "}";
    }
}
