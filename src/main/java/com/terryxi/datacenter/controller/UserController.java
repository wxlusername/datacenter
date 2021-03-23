package com.terryxi.datacenter.controller;

import com.terryxi.datacenter.entity.TradeUser;
import com.terryxi.datacenter.mapper.TradeUserMapper;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/user")
@RestController
public class UserController {

    private final TradeUserMapper tradeUserMapper;

    public UserController(TradeUserMapper tradeUserMapper) {
        this.tradeUserMapper = tradeUserMapper;
    }

    @RequiresPermissions("admin")
    @GetMapping("/trade/list")
    public List<TradeUser> getTradeUserList() {
        return tradeUserMapper.selectList(null);
    }
}
