package com.terryxi.datacenter.service;

import com.terryxi.datacenter.mapper.SopOrderMapper;
import com.terryxi.datacenter.mapper.TradeOrderMapper;
import com.terryxi.datacenter.vo.SaleStatisticsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatisticsService {

    final TradeOrderMapper tradeOrderMapper;
    final SopOrderMapper sopOrderMapper;

    public StatisticsService(TradeOrderMapper tradeOrderMapper, SopOrderMapper sopOrderMapper) {
        this.tradeOrderMapper = tradeOrderMapper;
        this.sopOrderMapper = sopOrderMapper;
    }

    public List<SaleStatisticsVO> getSaleStatisticsByDate(String startDate, String endDate ){
        List<SaleStatisticsVO> tradeSaleStatisticsByDate = tradeOrderMapper.getSaleStatisticsByDate(startDate, endDate);
        List<SaleStatisticsVO> sopASaleStatisticsByDate = sopOrderMapper.getSaleStatisticsByDate(startDate, endDate);
        List<SaleStatisticsVO> saleStatisticsByDate = new ArrayList<>();
        saleStatisticsByDate.addAll(sopASaleStatisticsByDate);
        saleStatisticsByDate.addAll(tradeSaleStatisticsByDate);
        return saleStatisticsByDate;

    }

}
