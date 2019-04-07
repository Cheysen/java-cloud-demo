package com.ooqiu.gaming.microserviceserviceadmin.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.ooqiu.gaming.microservicedemodomain.domain.Channel;
import com.ooqiu.gaming.microserviceserviceadmin.mapper.ChannelMapper;
import com.ooqiu.gaming.microserviceserviceadminapi.ChannelService;
import microservice.demo.commons.constant.DubboVersionConstant;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;
import utils.IDUtils;


import java.util.Date;
import java.util.List;

/**
 * @Author Cheysen
 * @Description 频道接口实现
 * @Date 2019/4/7 0:17
 * @Version 1.0
 */
@Service(version = DubboVersionConstant.DUBBO_VERSION_MICROSERVICE_SERVICE_ADMIN)
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    private ChannelMapper channelMapper;
    @Override
    public List<Channel> selectAll() {
        return channelMapper.selectAll();
    }

    @Override
    public Channel getById(Long id) {
        return null;
    }

    @Override
    public int save(Channel channel) {
        channel.setId(IDUtils.genId());
        channel.setIsParent("1");
        channel.setCreateDate(new Date());
        channel.setUpdateDate(new Date());
        /**判断是否为父级频道*/
        if(channel.getPid()==null||channel.getPid()==0L){
            channel.setPid(0L);
            channel.setIsParent("0");
        }
        int result = channelMapper.insert(channel);
        return result;
    }

    @Override
    public List<Channel> selectByPid(Long pid) {
        Example example = new Example(Channel.class);
        example.createCriteria().andEqualTo("pid",pid);
        return channelMapper.selectByExample(example);
    }
}
