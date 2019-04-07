package com.ooqiu.gaming.microserviceserviceadminapi;

import com.ooqiu.gaming.microservicedemodomain.domain.Channel;

import java.util.List;

/**
 * @Author Cheysen
 * @Description 频道接口
 * @Date 2019/4/7 0:16
 */
public interface ChannelService {
    public List<Channel> selectAll();
    public Channel getById(Long id);
    public int save(Channel channel);
    public List<Channel> selectByPid(Long id);
}
