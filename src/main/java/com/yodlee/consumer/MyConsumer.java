package com.yodlee.consumer;

import com.yodlee.service.MyService;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {
    private MyService myService;

    public void log(String message) {
        myService.log(message);
    }
}
