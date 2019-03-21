package com.yodlee.service;

import java.util.Date;

public class MyService {
    public void log(String message) {
        System.out.println(new Date() + " :: " + message);
    }
}
