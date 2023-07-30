package com.fahrurben.ecommerceserviceapi.mapper;

import org.mapstruct.Mapper;

import com.fahrurben.ecommerceserviceapi.dto.UserView;
import com.fahrurben.ecommerceserviceapi.models.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserViewMapper {
    public UserView toUserView(User user);

    public List<UserView> toUserView(List<User> users);
}