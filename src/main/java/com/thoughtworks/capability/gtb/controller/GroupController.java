package com.thoughtworks.capability.gtb.controller;
import com.thoughtworks.capability.gtb.model.Group;
import com.thoughtworks.capability.gtb.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
public class GroupController {
    private final List<User> users;
    private UserController uc = new UserController();

    public GroupController() {
        this.users = uc.getUserList();

    }

    @RequestMapping(value = "/grouplist", method = RequestMethod.GET)
    public List<Group> group() {
        List<Group> groups = new ArrayList<>(6);

        for (int i = 0; i < 6; i++) {
            groups.add(new Group(i, (i + 1) + " 组"));
        }

        Collections.shuffle(this.users);

        for (int i = 0; i < this.users.size(); i++) {
            User user = this.users.get(i);
            groups.get(i % 6).addUser(user);
        }

        return groups.stream()
                .peek(group -> group.getUsers().sort(Comparator.comparing(User::getId)))
                .collect(Collectors.toList());
    }
}

