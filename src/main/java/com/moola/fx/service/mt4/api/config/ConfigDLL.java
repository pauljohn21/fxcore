package com.moola.fx.service.mt4.api.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties(prefix = "mt4.manager")
@Data
public class ConfigDLL {

    private String dll;

    private String api;

    private String ip;

    public String getDll() {
        return dll;
    }

    public void setDll(String dll) {
        this.dll = dll;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
