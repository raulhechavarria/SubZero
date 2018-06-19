package com.subzero.controller.rest;

import java.util.HashSet;
import java.util.List;

import javax.print.attribute.HashAttributeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.subzero.controller.request.UserRequest;
import com.subzero.service.UserService;
import com.subzero.service.dto.GetUserDto;
import com.subzero.service.dto.SaveUserDto;
import com.subzero.service.dto.UpdateUserDto;
import com.subzero.service.dto.UserDto;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.POST) /// todo este metodo es un endpoint
	public @ResponseBody SaveUserDto saveUser(@RequestBody UserRequest userRequest) {
		return userService.saveUser(userRequest);
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	private UpdateUserDto updateUser(@RequestBody UserRequest userRequest) {
		return userService.updateUser(userRequest);
	}
	
///	@RequestParam esperandno un parametro pero  a lo mejor en el body 
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	private GetUserDto getUser(@PathVariable Integer id) {
		Long long1 = new Long(id);
		return userService.getUser(long1);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	private @ResponseBody List<GetUserDto> getUsers() {
		return userService.getUsers();
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteUser(@PathVariable Long id) {
		return userService.deleteUser(id);
	}

}
