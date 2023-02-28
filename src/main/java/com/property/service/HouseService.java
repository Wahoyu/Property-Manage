package com.property.service;

import com.property.entity.House;
import com.baomidou.mybatisplus.extension.service.IService;
import com.property.entity.House;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 * 房屋信息 服务类
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */
public interface HouseService {

    //查询单个房屋信息
    House selectHouseById(Integer id);


}
