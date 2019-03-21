package com.yodlee.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.yodlee.consumer"})
public class MyConfiguration {

}
