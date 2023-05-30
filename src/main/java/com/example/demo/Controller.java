package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Hashtable;

@RestController
public class Controller {
    private static final String template = "Hello, %s!";
    public String studentId;

    @GetMapping("/get_studentRecord")
    public Hashtable<String, String> greeting(@RequestParam(value = "studentId", required = false, defaultValue = "1") Integer age) {
        this.studentId = age.toString();
        Hashtable<String, String> hashTable = new Hashtable<>();

        hashTable.put("studentId", this.studentId);
        return (hashTable);
    }
}
