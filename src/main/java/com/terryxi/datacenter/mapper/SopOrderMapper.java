package com.terryxi.datacenter.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.terryxi.datacenter.entity.TradeUser;
import com.terryxi.datacenter.vo.SaleStatisticsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@DS("sop")
public interface SopOrderMapper extends BaseMapper<TradeUser> {

    List<SaleStatisticsVO> getSaleStatisticsByDate(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
