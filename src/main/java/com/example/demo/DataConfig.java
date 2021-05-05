package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataConfig {


    @Bean
    public Pojo pojo() {
        return new Pojo("some value");
    }

    @Bean
    public List<String> defaultData(){
        return List.of("5", "4", "3", "2", "1");
    }

    @Bean
    public List<String> otherDeafultData() {
        return List.of("1", "2", "3", "4", "5");
    }

}
