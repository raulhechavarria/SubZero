package com.subzero.service.assembler;

import com.subzero.domian.entity.Email;
import com.subzero.service.dto.GetEmailDto;
import com.subzero.service.dto.SaveEmailDto;
import com.subzero.service.dto.UpdateEmailDto;

public class EmailAssembler {

	public static SaveEmailDto saveEmail(Email email) { ///  that  is aged
		SaveEmailDto saveEmailDto = new SaveEmailDto();
		saveEmailDto.setEmail(email.getEmail());
		saveEmailDto.setId(email.getId());
		saveEmailDto.setUser(email.getUser());	
		return saveEmailDto;
	}

	public static UpdateEmailDto updateEmail(Email email) {
		UpdateEmailDto updateEmailDto = new UpdateEmailDto();
		updateEmailDto.setEmail(email.getEmail());
		updateEmailDto.setId(email.getId());
		updateEmailDto.setUser(email.getUser());
		return updateEmailDto;
	}

	public static GetEmailDto getEmailDto(Email email) {
		GetEmailDto getEmailDto = new GetEmailDto();
		getEmailDto.setEmail(email.getEmail());
		getEmailDto.setId(email.getId());
		getEmailDto.setUser(email.getUser());
		return getEmailDto;
	}
}
