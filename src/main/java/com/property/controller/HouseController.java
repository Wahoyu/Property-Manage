package com.property.controller;


import com.property.entity.House;
import com.property.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 房屋信息 前端控制器
 * </p>
 *
 * @author 
 */
@RestController
@RequestMapping("/house")
public class HouseController {

    //引用变量
    @Autowired
    HouseService houseService;

    //查询单个房屋信息
    //不能用PostMapping
    @RequestMapping ("/select/{id}")
    public House selectHouseById(@PathVariable("id") Integer id){
        House house = houseService.selectHouseById(id);
        System.out.println(house);
        return house;
    }

    //测试方法
    @RequestMapping("/house")
    @ResponseBody
    public House house(){
        House house = new House();
        house.setAddress("1-1-1");
        house.setId(1);
        house.setUid(10);
        return house;
    }

}

