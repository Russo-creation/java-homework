package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ComponentConfig {

    //Conditional homework
    @Bean
    @ConditionalOnProperty(value="my.custom.varboolean", havingValue = "true")
    public MyforhtComponent myforhtComponent() {
        return new MyforhtComponent("Przemek");
    }

    @Bean
    public MyforhtComponent myforhtComponent2() {
        return new MyforhtComponent("Hello from second bean");
    }

}
