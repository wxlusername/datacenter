package com.terryxi.datacenter.controller;

import cn.hutool.Hutool;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import com.terryxi.datacenter.service.StatisticsService;
import com.terryxi.datacenter.vo.SaleStatisticsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/s")
@RestController
public class StatisticsController {

    final StatisticsService statisticsService;

    public StatisticsController(StatisticsService statisticsService) {
        this.statisticsService = statisticsService;
    }

    @GetMapping("/w")
    public List<String[]> weekStatistics() {
        Date date = new Date();
        String startDate = DateUtil.beginOfWeek(date).toDateStr();
        String endDate = DateUtil.offsetDay(DateUtil.endOfWeek(date), 1).toDateStr();
        String endDateShow = DateUtil.endOfWeek(date).toDateStr();
        List<SaleStatisticsVO> saleStatisticsByDate = statisticsService.getSaleStatisticsByDate(startDate, endDate);
        List<String[]> result = new ArrayList<>();
        for (SaleStatisticsVO saleStatisticsVO : saleStatisticsByDate) {
            result.add(new String[]{saleStatisticsVO.getGroupName() + "\t" + saleStatisticsVO.getNickName(), saleStatisticsVO.getTotalAmount(),startDate+"\n\t\t\t\t|\n"+endDateShow});
        }
        return result;
    }
}
