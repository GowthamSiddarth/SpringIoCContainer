package com.yodlee.configuration;

import com.yodlee.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.yodlee.consumer"})
public class MyConfiguration {
    @Bean
    public MyService getMyService() {
        return new MyService();
    }
}
