package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SandboxController {

    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld(){
        return ResponseEntity.ok("Hello world");
    }

    @GetMapping("/model")
    public ResponseEntity<Car> getCarModel(){
        Car car = new Car("Audi");
        return ResponseEntity.ok(car);
    }
}
