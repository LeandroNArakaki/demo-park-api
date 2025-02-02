package com.larakaki.demo_park_api.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;

@Configuration
public class SpringTimezoneConfig {

    @PostConstruct
    public void timezoneConfig(){
        TimeZone.setDefault(TimeZone.getTimeZone("America/Campo_Grande"));
    }

}
