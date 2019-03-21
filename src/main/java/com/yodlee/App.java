package com.yodlee;

import com.yodlee.configuration.MyConfiguration;
import com.yodlee.consumer.MyConsumer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        MyConsumer application = context.getBean(MyConsumer.class);

        application.log("Hello");
        context.close();
    }
}
