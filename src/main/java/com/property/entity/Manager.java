package com.property.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 物业人员
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */

@Data
@ApiModel(value="Manager对象", description="物业人员")
public class Manager implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "物业管理员编号")
      private Integer m_id;

    @ApiModelProperty(value = "管理员名字")
    private String m_name;

    @ApiModelProperty(value = "手机号")
    private String m_tele;

    @ApiModelProperty(value = "账号")
    private String m_username;

    @ApiModelProperty(value = "密码")
    private String m_password;


    public Integer getM_id() {
        return m_id;
    }

    public void setM_id(Integer m_id) {
        this.m_id = m_id;
    }

    public String getM_name() {
        return m_name;
    }

    public void setM_name(String m_name) {
        this.m_name = m_name;
    }

    public String getM_tele() {
        return m_tele;
    }

    public void setM_tele(String m_tele) {
        this.m_tele = m_tele;
    }

    public String getM_username() {
        return m_username;
    }

    public void setM_username(String m_username) {
        this.m_username = m_username;
    }

    public String getM_password() {
        return m_password;
    }

    public void setM_password(String m_password) {
        this.m_password = m_password;
    }

    @Override
    public String toString() {
        return "Manager{" +
        "m_id=" + m_id +
        ", m_name=" + m_name +
        ", m_tele=" + m_tele +
        ", m_username=" + m_username +
        ", m_password=" + m_password +
        "}";
    }
}
