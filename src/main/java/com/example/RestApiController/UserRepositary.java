package com.example.RestApiController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Repository
public class UserRepositary {

    Map<Integer,User> users = new HashMap<>();

    public void addUserinDB(User user){
        users.put(user.getId(), user);
    }

    public List<User> getAllUserFromDB(){
        List<User> listofUsers = new ArrayList<>();
        for(User user:users.values()){
            listofUsers.add(user);
        }
        return listofUsers;
    }
}
