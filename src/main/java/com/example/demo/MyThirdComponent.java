package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {

    public MyThirdComponent(Pojo pojo, ApplicationContext applicationContext, @Value("${my.custom.varboolean}") Boolean varbool) {
        //safty first but remove if you want to check if conditional works
        if(varbool == true) {
            MyforhtComponent myForhtComponent = applicationContext.getBean("myforhtComponent", MyforhtComponent.class);
            System.out.println(myForhtComponent.getName()+ " this is name");
        }

        pojo.setField("test from pojo");
        System.out.println(pojo.getField());
    }
}
