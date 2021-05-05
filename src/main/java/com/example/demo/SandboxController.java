package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> getPathVariable(@PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }

    @GetMapping("/hello/")
    public ResponseEntity<List<String>> getReqVariable(@RequestParam List<String> reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    @PostMapping("/model")
    public ResponseEntity<Car> createCar(@RequestBody Car car) {
        return ResponseEntity.ok(car);
    }

}
