package com.ooqiu.gaming.microserviceserviceadmin.impl;

import com.ooqiu.gaming.microservicedemodomain.domain.Channel;
import com.ooqiu.gaming.microservicedemodomain.mapper.ChannelMapper;
import com.ooqiu.gaming.microserviceserviceadminapi.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author Cheysen
 * @Description 频道接口实现
 * @Date 2019/4/7 0:17
 * @Version 1.0
 */
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    private ChannelMapper channelMapper;

    @Override
    public List<Channel> selecAll() {
        return channelMapper.selectAll();
    }
}
