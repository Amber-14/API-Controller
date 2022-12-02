package com.example.RestApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtherController {

    @Autowired
    User obj1;

    public OtherController(){
        System.out.println("SpringBoot is creating the object");
    }

    @GetMapping("other_controller")
    public User testBean(){
        System.out.println("The address of user object in other controller: "+obj1);
        return obj1;
    }
}
