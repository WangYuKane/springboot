package com.xpwi.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName springboot
 * @Author Y.Wang
 * @Create 2021/2/6 13:45
 * @Describe
 */

@Component
@ConfigurationProperties(prefix = "author")
public class author {
    private String name;
    private String vueUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVueUrl() {
        return vueUrl;
    }

    public void setVueUrl(String vueUrl) {
        this.vueUrl = vueUrl;
    }
}
