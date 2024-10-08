package com.example.IdentityUserAPI.controller;

import com.example.IdentityUserAPI.dto.request.ApiResponse;
import com.example.IdentityUserAPI.dto.request.UserCreationRequest;
import com.example.IdentityUserAPI.dto.request.UserUpdateRequest;
import com.example.IdentityUserAPI.dto.response.UserResponse;
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
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiResponse<User> apiResponse = new ApiResponse<>();

        apiResponse.setResult(userService.createRequest(request));
        return apiResponse;
    }

    @GetMapping("/get-users")
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get-user/{userId}")
    UserResponse getUser(@PathVariable("userId") String userId){
        return userService.getUser(userId);
    }

    @PutMapping("/edit-user/{userId}")
    UserResponse editUser(@PathVariable("userId") String userId, @RequestBody UserUpdateRequest request){
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/delete-user/{userId}")
    String deleteUser(@PathVariable("userId") String userId){
        userService.deleteUser(userId);
        return "User has been deleted!";
    }
}
