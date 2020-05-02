package com.example.greeting;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class GreetingControllerTest {
    @Autowired
    public GreetingController greetingController;

    @Test
    public void testGreetingController(){
        String greeting = greetingController.sendGreeting();
        Assert.assertEquals("Hello World!",greeting);
    }

    @Test
    public void testSendBoolean(){
        Boolean greeting = greetingController.sendBoolean();
        Assert.assertTrue(greeting);
    }




}