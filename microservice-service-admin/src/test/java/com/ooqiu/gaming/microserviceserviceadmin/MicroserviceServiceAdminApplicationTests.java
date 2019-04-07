package com.ooqiu.gaming.microserviceserviceadmin;

import com.ooqiu.gaming.microservicedemodomain.domain.Channel;
import com.ooqiu.gaming.microserviceserviceadmin.mapper.ChannelMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MicroserviceServiceAdminApplicationTests {
    @Autowired
    private ChannelMapper channelMapper;
    @Test
    public void contextLoads() {
    }
    @Test
    public void testChannelSelectAll(){
        List<Channel> channels = channelMapper.selectAll();
        System.out.println(channels);
    }

}
