package com.moonzhou.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 自定义配置注入类
 *
 * @author 17080118
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Configuration
@Component
@PropertySource("classpath:config/zmTest.properties")
@ConfigurationProperties(prefix = "finance.member.system")
public class CustomedConfig {
    private String ems;
    
    private String epw;

    public String getEms() {
        return ems;
    }

    public void setEms(String ems) {
        this.ems = ems;
    }

    public String getEpw() {
        return epw;
    }

    public void setEpw(String epw) {
        this.epw = epw;
    }

}
