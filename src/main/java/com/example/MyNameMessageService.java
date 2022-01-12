package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    private String name = "Szymon Zylski";

    @Override
    public String getMessage() {
        return this.name;
    }
}


