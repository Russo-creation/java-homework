package com.example.demo;


public class Pojo {
    private String field;

    public Pojo(String field) {
        this.field = field;
        System.out.print("hello from consturctor");
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void soutString(){
        System.out.print(field);
    }
}
