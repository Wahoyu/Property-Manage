package com.property.mapper;

import com.property.entity.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.property.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 缴费单 Mapper 接口
 * </p>
 *
 * @author
 */

@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}
