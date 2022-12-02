package com.example.RestApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class UserService {
    @Autowired
    UserRepositary userRepositary;

    public void addUserToDB(User user){
        userRepositary.addUserinDB(user);
    }
    public List<User> getAllUser(){
        return userRepositary.getAllUserFromDB();
    }
}
