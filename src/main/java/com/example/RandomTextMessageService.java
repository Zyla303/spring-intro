package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService{

    public List<String> listOfMessages = new ArrayList<String>(){{
        add("Message 1");
        add("Message 2");
        add("Message 3");
        add("Message 4");
        add("Message 5");
        add("Message 6");
        add("Message 7");
        add("Message 8");
        add("Message 9");
        add("Message 10");
    }};
    @Override
    public String getMessage() {
        int randomNumber = new Random().nextInt(9 + 1);
        return this.listOfMessages.get(randomNumber);
    }
}