package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {

    public MySecondComponent(MyFirstComponent myFirstComponent){
        System.out.println("Hello from mySecond component");
    }

    public void helloFromMethod(){
        System.out.println("Hello from MySecondComponent.helloFromMethod");
    }
}
