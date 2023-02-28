package com.property.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 停车位
 * </p>
 *
 * @author 
 */

@Data
@ApiModel(value="Parking_place对象", description="停车位")
public class Parking_place implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "车位编号")
      private Integer p_id;

    @ApiModelProperty(value = "车位地址")
    private String p_position;

    @ApiModelProperty(value = "当前绑定车牌")
    private String p_plate;

    @ApiModelProperty(value = "车位状态")
    private String p_state;


    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_position() {
        return p_position;
    }

    public void setP_position(String p_position) {
        this.p_position = p_position;
    }

    public String getP_plate() {
        return p_plate;
    }

    public void setP_plate(String p_plate) {
        this.p_plate = p_plate;
    }

    public String getP_state() {
        return p_state;
    }

    public void setP_state(String p_state) {
        this.p_state = p_state;
    }

    @Override
    public String toString() {
        return "Parking_place{" +
        "p_id=" + p_id +
        ", p_position=" + p_position +
        ", p_plate=" + p_plate +
        ", p_state=" + p_state +
        "}";
    }
}
