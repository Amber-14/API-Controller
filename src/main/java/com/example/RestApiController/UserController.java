package com.example.RestApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/get_users") // "get_users" - api endpoint
    public ResponseEntity<List<User>> getUsers(){
        return new ResponseEntity<>(userService.getAllUser(), HttpStatus.ACCEPTED);
    }
//    @PostMapping("/add_user")
//    public void addUser(@RequestParam("id") int id,
//                        @RequestParam("name") String name,
//                        @RequestParam("country") String country,
//                        @RequestParam("age") int age)
//    {
//        User newuser = new User(id, name, country, age);
//        users.put(id,newuser);
//    }
    
    // to remove the uses of Requestparam -
    @PostMapping("add_user_body")
    public ResponseEntity addUserBody(@RequestBody(required = true) User u){
        userService.addUserToDB(u);
        return new ResponseEntity(HttpStatus.CREATED);
    }

//    //suppose we want to get any particular path
//    @GetMapping("/get_user/{id}")
//    public User getUser(@PathVariable("id") int x){
//        return users.get(x);
//    }
//
//    @DeleteMapping("/del_user/{id}")
//    public void deleteUser(@PathVariable("id") int idx){
//        users.remove(idx);
//    }
//
//    @PutMapping("/update/{id}")
//    public void updateUser(@PathVariable("id") int id,@RequestBody()User u){
//        users.put(id,u);
//    }
}
