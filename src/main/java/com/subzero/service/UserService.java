package com.subzero.service;

import java.util.HashSet;
import java.util.List;

import com.subzero.controller.request.UserRequest;
import com.subzero.service.dto.GetUserDto;
import com.subzero.service.dto.SaveUserDto;
import com.subzero.service.dto.UpdateUserDto;
import com.subzero.service.dto.UserDto;

public interface UserService {

	SaveUserDto saveUser(UserRequest userRequest);

	UpdateUserDto updateUser(UserRequest userRequest);

	GetUserDto getUser(Long id);

	List<GetUserDto> getUsers();

	boolean deleteUser(Long id);

}
