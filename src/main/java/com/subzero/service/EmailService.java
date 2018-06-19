package com.subzero.service;

import java.util.List;

import com.subzero.controller.request.EmailRequest;
import com.subzero.domian.entity.Email;
import com.subzero.domian.entity.User;
import com.subzero.service.dto.GetEmailDto;
import com.subzero.service.dto.SaveEmailDto;
import com.subzero.service.dto.UpdateEmailDto;

public interface EmailService {

	SaveEmailDto saveEmail(EmailRequest emailRequest);

	UpdateEmailDto updateEmail(EmailRequest emailRequest);

	GetEmailDto getEmail(Long long1);

	List<GetEmailDto> getEmails();

	boolean deleteEmail(Long id);

	void saveEmails(User user, List<EmailRequest> list);

	List<GetEmailDto> getEmailsByUser(Long id);

	

}
