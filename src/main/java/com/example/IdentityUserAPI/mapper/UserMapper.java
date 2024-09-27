package com.example.IdentityUserAPI.mapper;

import com.example.IdentityUserAPI.dto.request.UserCreationRequest;
import com.example.IdentityUserAPI.dto.request.UserUpdateRequest;
import com.example.IdentityUserAPI.dto.response.UserResponse;
import com.example.IdentityUserAPI.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    //@Mapping(source = "firstName", target = "lastName")
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest request);
}
