package com.ooqiu.gaming.microservicewebadmin.controller;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.google.common.collect.Lists;
import com.ooqiu.gaming.microservicedemodomain.domain.Channel;
import com.ooqiu.gaming.microserviceserviceadminapi.ChannelService;

import com.ooqiu.gaming.microservicewebadmin.dto.TreeView;
import microservice.demo.commons.constant.DubboVersionConstant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Cheysen
 * @Description
 * @Date 2019/4/7 16:34
 * @Version 1.0
 */
@Controller
@RequestMapping("channel")
public class ChannelController {
    @Reference(version= DubboVersionConstant.DUBBO_VERSION_MICROSERVICE_SERVICE_ADMIN)
    private ChannelService channelService;

    @GetMapping("list")
    public String list(Model model){
        List<Channel> channels = channelService.selectAll();
        model.addAttribute("channels",channels);
        System.out.println("list");
        return "modules/channel/list";
    }
    /**
     * @Description 跳转表单页面
     * @Author Cheysen
     * @Date 2019/4/8 2:29
     * @Param []
     * @return java.lang.String
     */
    @GetMapping("form")
    public String form(){
        System.out.println("form");
        return "modules/channel/form";
    }
    @PostMapping("save")
    public String save(Channel channel){
        int save = channelService.save(channel);
        System.out.println(save);
        return "redirect:channel/list";
    }
    /**
     * 前端树结构
     * @param pid
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "tree")
    public List<TreeView> treeData(String pid) {
        List<TreeView> list = Lists.newArrayList();
        System.out.println("进来了");

        // 处理首次查询的参数
        if (StringUtils.isBlank(pid) || "#".equals(pid)) {
            pid = "0";
        }

        List<Channel> channels = channelService.selectByPid(Long.parseLong(pid));
        for (Channel channel : channels) {
            TreeView treeView = new TreeView();
            treeView.setId(String.valueOf(channel.getId()));
            treeView.setIcon("");
            treeView.setText(channel.getName());
            treeView.setChildren("0".equals(channel.getIsParent()));
            list.add(treeView);
        }

        return list;
    }

}
