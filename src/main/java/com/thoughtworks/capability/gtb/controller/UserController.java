package com.thoughtworks.capability.gtb.controller;

import com.thoughtworks.capability.gtb.model.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:1234")
@RestController
public class UserController {

    private final List<User> users;

    public UserController() {
        this.users = new ArrayList<>();
        users.add(new User("成吉思汗",1));
        users.add(new User("鲁班七号",2));
        users.add(new User("太乙真人",3));
        users.add(new User("钟无艳",4));
        users.add(new User("花木兰",5));
        users.add(new User("雅典娜",6));
        users.add(new User("芈月",7));
        users.add(new User("白起",8));
        users.add(new User("刘禅",9));
        users.add(new User("庄周",10));
        users.add(new User("马超",11));
        users.add(new User("刘备",12));
        users.add(new User("哪吒",13));
        users.add(new User("大乔",14));
        users.add(new User("蔡文姬",15));
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public List<User> hello(){
        return users;
    }
}
