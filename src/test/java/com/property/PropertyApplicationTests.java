package com.property;

import com.property.controller.HouseController;
import com.property.entity.House;
import com.property.mapper.HouseMapper;
import com.property.service.HouseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PropertyApplicationTests {

    @Autowired
    HouseController houseController;
    @Autowired
    HouseMapper houseMapper;
    @Autowired
    HouseService houseService;

    @Test
    //通过id查询单个用户
    public void testSelectById(){
        //House house = houseMapper.selectById(1);
        //House house = houseService.selectHouseById(1);
        House house = houseController.selectHouseById(1);
        System.out.println(house);
    }

}
