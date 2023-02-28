package com.property.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.property.entity.House;
import com.property.mapper.HouseMapper;
import com.property.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 房屋信息 服务实现类
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */
@Service
public class HouseServiceImpl implements HouseService {

    //引用变量
    @Autowired
    HouseMapper houseMapper;

    @Override
    public House selectHouseById(Integer id) {
        return houseMapper.selectById(id);
    }
}
