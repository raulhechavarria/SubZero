package com.subzero.service.assembler;

import com.subzero.domian.entity.User;
import com.subzero.service.dto.GetUserDto;
import com.subzero.service.dto.SaveUserDto;
import com.subzero.service.dto.UpdateUserDto;

public class UserAssembler {

	public static SaveUserDto saveUser(User user) { ///  that  is aged
		SaveUserDto saveUserDto = new SaveUserDto();
		saveUserDto.setId(user.getId());
		saveUserDto.setName(user.getName());
		saveUserDto.setLastName(user.getLastName());
		saveUserDto.setLogin(user.getLogin());
		saveUserDto.setPassword(user.getPassword());
		saveUserDto.setCompany(user.getCompany());
		saveUserDto.setAddress(user.getAddress());
		return saveUserDto;
	}

	public static UpdateUserDto updateUser(User user) {
		UpdateUserDto updateUserDto = new UpdateUserDto();
		updateUserDto.setId(user.getId());
		updateUserDto.setName(user.getName());
		updateUserDto.setLastName(user.getLastName());
		updateUserDto.setLogin(user.getLogin());
		updateUserDto.setPassword(user.getPassword());
		updateUserDto.setCompany(user.getCompany());
		updateUserDto.setAddress(user.getAddress());
		return updateUserDto;
	}

	public static GetUserDto getUserDto(User user) {
		GetUserDto getUserDto = new GetUserDto();
		getUserDto.setId(user.getId());
		getUserDto.setName(user.getName());
		getUserDto.setLastName(user.getLastName());
		getUserDto.setLogin(user.getLogin());
		getUserDto.setPassword(user.getPassword());
		getUserDto.setCompany(user.getCompany());
		getUserDto.setAddress(user.getAddress());
		return getUserDto;
	}
}
