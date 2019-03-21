package com.yodlee.consumer;

import com.yodlee.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyConsumer {
    private MyService myService;

    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public void log(String message) {
        myService.log(message);
    }
}
