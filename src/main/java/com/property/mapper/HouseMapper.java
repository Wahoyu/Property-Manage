package com.property.mapper;

import com.property.entity.House;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.property.entity.House;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 房屋信息 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */

@Mapper
public interface HouseMapper extends BaseMapper<House> {

    House selectHouseById(Integer id);
}
