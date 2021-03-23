package com.terryxi.datacenter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.terryxi.datacenter.entity.TradeUser;

@DS("trade")
public interface TradeUserMapper extends BaseMapper<TradeUser> {
}
