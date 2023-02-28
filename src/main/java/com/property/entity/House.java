package com.property.entity;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 房屋信息
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */

@Data
public class House {

    private Integer id;

    //属性名应该符合正则表达式,否则不能直接进行匹配
    private String address;

    private Integer uid;

}
