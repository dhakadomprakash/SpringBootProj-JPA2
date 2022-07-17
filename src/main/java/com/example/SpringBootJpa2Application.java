package com.example;

import com.example.entity.Actor;
import com.example.service.ActorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootJpa2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpa2Application.class, args);
        ActorService actorService = context.getBean("actorService", ActorService.class);
        Actor actor1 = Actor.builder().actName("deepak Dhakad").actorDesignation("MTS").actorNumber(999999L).build();
        Actor actor2 = Actor.builder().actName("Rajia Dhakad").actorDesignation("MTS").actorNumber(999999L).build();
        String result = actorService.addAllActors(List.of(actor1, actor2));
        System.out.println("here is my result: " + result);
    }

}
