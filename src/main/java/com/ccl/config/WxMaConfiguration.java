package com.ccl.config;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.api.impl.WxMaServiceImpl;
import cn.binarywang.wx.miniapp.config.impl.WxMaDefaultConfigImpl;
import com.ccl.entity.wexin.WxConfigParams;
import com.ccl.service.WxConfigService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @Auther: liuc
 * @Date: 2023/9/7 08:58
 * @Description: 微信小程序配置
 */
@Slf4j
@AllArgsConstructor
@Configuration
public class WxMaConfiguration {

    @Resource
    private WxConfigService wxConfigService;

    @Bean
    public WxMaService wxMaService() {

        //单个
        WxConfigParams wxConfigParams = wxConfigService.selectWxConfigValue();
        WxMaService wxMaService = new WxMaServiceImpl();
        WxMaDefaultConfigImpl config = new WxMaDefaultConfigImpl();
        config.setAppid(wxConfigParams.getAppletAppid());
        config.setSecret(wxConfigParams.getAppletSecret());
        config.setToken(wxConfigParams.getToken());
        config.setAesKey(wxConfigParams.getAesKey());
        wxMaService.setWxMaConfig(config);
        return wxMaService;
    }
}
