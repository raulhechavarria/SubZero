package com.subzero.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subzero.controller.request.UserRequest;
import com.subzero.domian.entity.User;
import com.subzero.repository.EmailRepository;
import com.subzero.repository.UserRepository;
import com.subzero.service.EmailService;
import com.subzero.service.UserService;
import com.subzero.service.assembler.UserAssembler;
import com.subzero.service.dto.GetUserDto;
import com.subzero.service.dto.SaveUserDto;
import com.subzero.service.dto.UpdateUserDto;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	EmailService emailService;

	@Override
	public SaveUserDto saveUser(UserRequest userRequest) {
		User user = new User(null, userRequest.getName(), userRequest.getLastName(), userRequest.getLogin(),
				userRequest.getPassword(), userRequest.getCompany(), userRequest.getAddress());
		user = userRepository.save(user);
		emailService.saveEmails(user, userRequest.getEmails());
		SaveUserDto  saveUserDto =  UserAssembler.saveUser(user);
		return saveUserDto;
	}

	@Override
	public UpdateUserDto updateUser(UserRequest userRequest) {
		User user = new User(userRequest.getId(), userRequest.getName(), userRequest.getLastName(),
				userRequest.getLogin(), userRequest.getPassword(), userRequest.getCompany(), userRequest.getAddress());
		user = userRepository.save(user);
		UpdateUserDto updateUserDto = UserAssembler.updateUser(user);
		
		return updateUserDto;
	}

	@Override
	public GetUserDto getUser(Long id) {
		User user = userRepository.findById(id).get();
		GetUserDto getUserDto = UserAssembler.getUserDto(user);
		return getUserDto;
	}

	@Override
	public List<GetUserDto> getUsers() {

		List<User> users = (List<User>) userRepository.findAll();
		List<GetUserDto> getUsersDto = new ArrayList<>(users.size());
		for (User user : users) {
			GetUserDto getUserDto = UserAssembler.getUserDto(user);
			getUsersDto.add(getUserDto);
		}

		return getUsersDto;
	}

	@Override
	public boolean deleteUser(Long id) {
		try {
			userRepository.deleteById(id);	
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return true;
	}

}
