package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyFirstComponent {
    public MyFirstComponent(
            @Value("${my.custom.property}") String propertiesValue,
            @Value("${my.custom.random:default value form string }") String defaultPropertiesValue,
            List<String> otherDeafultData
    ){
        System.out.println(otherDeafultData);
        System.out.println(propertiesValue);
        System.out.println(defaultPropertiesValue);
        System.out.println("Hello from MyFirstComponent ");
    }

    public void helloFromMethod(){
        System.out.println("Hello from MyFirst.mySecondComponent");
    }
}
