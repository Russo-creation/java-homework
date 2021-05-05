package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    //GET: localhost:8080/homework/test1
    @GetMapping("/{getValue}")
    public ResponseEntity<String> getPathVariable(@PathVariable String getValue) {
        return ResponseEntity.ok(getValue);
    }

    //GET: localhost:8080/homework/?reqParam=test2
    @GetMapping("/")
    public ResponseEntity<List<String>> getReqVariable(@RequestParam List<String> reqParam) {
        return ResponseEntity.ok(reqParam);
    }

    //PUT: localhost:8080/homework/test3
    @PutMapping("/{putValue}")
    public ResponseEntity<String> putPathVariable(@PathVariable String putValue) {
        return ResponseEntity.ok(putValue);
    }

    //PUT: localhost:8080/homework/
    //raw send:
    //{
    //    "task": "Java zjazd 4"
    //}
    @PutMapping("/")
    public ResponseEntity<Homework> putRequestBody(@RequestBody Homework homework) {
        return ResponseEntity.ok(homework);
    }

    //POST: localhost:8080/homework/
    //raw send:
    //{
    //    "task": "Java zjazd 4"
    //}
    @PostMapping("/")
    public ResponseEntity<Homework> postRequestBody(@RequestBody Homework homework) {
        return ResponseEntity.ok(homework);
    }

    //Delete: localhost:8080/homework/1
    @DeleteMapping("/{deleteValue}")
    public ResponseEntity deletePathVariable(@PathVariable String deleteValue) {
        return ResponseEntity.ok().build();
    }

}
