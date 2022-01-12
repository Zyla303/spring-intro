package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageServiceConfig.class);

        MessageService messageService = applicationContext.getBean(RandomTextMessageService.class);

        MessageService messageService1 = applicationContext.getBean(MyNameMessageService.class);

        System.out.println("message 1 = " + messageService.getMessage());

        System.out.println("message 2 = " + messageService1.getMessage());

        System.out.println("#code 1 = " + messageService.hashCode());

        System.out.println("#code 2 = " + messageService1.hashCode());

        applicationContext.close();
    }
}
