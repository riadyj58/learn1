package com.learn.learn1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/")
    public String index()
    {
        return "String";
    }
    @GetMapping("/test")
    public String test()
    {
        return "Test";
    }
    @GetMapping("/person")
    public String person()
    {
        return "Person";}
        
    @GetMapping("/department")
    public String department()
    {
        return "Department";
    }
}
