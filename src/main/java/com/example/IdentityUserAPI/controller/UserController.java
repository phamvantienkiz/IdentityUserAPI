package com.example.IdentityUserAPI.controller;

import com.example.IdentityUserAPI.dto.request.UserCreationRequest;
import com.example.IdentityUserAPI.dto.request.UserUpdateRequest;
import com.example.IdentityUserAPI.entity.User;
import com.example.IdentityUserAPI.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/identity")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create-users")
    User createUser(@RequestBody @Valid UserCreationRequest request){
        return userService.createRequest(request);
    }

    @GetMapping("/get-users")
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get-user/{userId}")
    User getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    @PutMapping("/edit-user/{userId}")
    User editUser(@PathVariable("userId") String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/delete-user/{userId}")
    String deleteUser(@PathVariable("userId") String userId){
        userService.deleteUser(userId);
        return "User has been deleted!";
    }
}
