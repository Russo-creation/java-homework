package com.example.demo;

public class MyforhtComponent {

    private final String name;

    public MyforhtComponent(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void helloFromMethod(){
        System.out.println("Hello from MyForthComponent");
    }
}
