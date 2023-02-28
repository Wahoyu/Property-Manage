package com.property.mapper;

import com.property.entity.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 超级管理员 Mapper 接口
 * </p>
 *
 * @author 
 * @since 2023-02-28
 */

@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

}
