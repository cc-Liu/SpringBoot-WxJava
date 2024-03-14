package com.ccl.controller;


import com.ccl.service.WeChatMenuService;
import com.ccl.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 微信菜单管理 前端控制器
 *
 * @author liuc
 * @since 2021-09-17
 */
@Api(value = "微信公众号", tags = {"公众号菜单"})
@Slf4j
@RestController
@RequestMapping("/weChatMenu")
public class WeChatMenuController {

    @Resource
    private WeChatMenuService weChatMenuService;

    @ApiOperation(value = "创建微信菜单")
    @PostMapping("/createWeChatMenu")
    public R createWeChatMenu() {
        return weChatMenuService.createWeChatMenu();
    }

    @ApiOperation(value = "自定义菜单删除接口")
    @PostMapping("/delWeChatMenu")
    public R delWeChatMenu() {
        return weChatMenuService.delWeChatMenu();
    }
}

