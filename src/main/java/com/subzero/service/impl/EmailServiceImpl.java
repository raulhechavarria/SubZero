package com.subzero.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subzero.controller.request.EmailRequest;
import com.subzero.controller.request.ProductRequest;
import com.subzero.domian.entity.Email;
import com.subzero.domian.entity.Product;
import com.subzero.domian.entity.User;
import com.subzero.repository.EmailRepository;
import com.subzero.service.EmailService;
import com.subzero.service.assembler.EmailAssembler;
import com.subzero.service.assembler.ProductAssembler;
import com.subzero.service.dto.GetEmailDto;
import com.subzero.service.dto.GetProductDto;
import com.subzero.service.dto.SaveEmailDto;
import com.subzero.service.dto.SaveProductDto;
import com.subzero.service.dto.UpdateEmailDto;
import com.subzero.service.dto.UpdateProductDto;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	EmailRepository emailRepository;

	@Override
	public SaveEmailDto saveEmail(EmailRequest emailRequest) {
		Email email = new Email();
		email.setEmail(emailRequest.getEmail());
		email.setUser(emailRequest.getUser());
		emailRepository.save(email);

		SaveEmailDto saveEmailDto = EmailAssembler.saveEmail(email);
		return saveEmailDto;
	}

	@Override
	public UpdateEmailDto updateEmail(EmailRequest emailRequest) {
		Email email = new Email();
		email.setEmail(emailRequest.getEmail());
		email.setUser(emailRequest.getUser());
		email.setId(emailRequest.getId());
		emailRepository.save(email);

		UpdateEmailDto updateEmailDto = EmailAssembler.updateEmail(email);
		return updateEmailDto;
	}

	@Override
	public GetEmailDto getEmail(Long long1) {
		Email email = emailRepository.findById(long1).get();
		GetEmailDto getEmailDto = EmailAssembler.getEmailDto(email);
		return getEmailDto;
	}

	@Override
	public List<GetEmailDto> getEmails() {
		List<Email> emails = (List<Email>) emailRepository.findAll();
		List<GetEmailDto> getEmailDtos = new ArrayList<>(emails.size());
		for (Email email : emails) {
			GetEmailDto getEmailDto = EmailAssembler.getEmailDto(email);
			getEmailDtos.add(getEmailDto);
		}
		return getEmailDtos;
	}
	

	@Override
	public boolean deleteEmail(Long id) {
		if (emailRepository.findById(id).isPresent()) {
			emailRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void saveEmails(User user, List<EmailRequest> list) {
		for (EmailRequest emailRequest : list) {
			emailRequest.setUser(user);
			saveEmail(emailRequest);
		}
		
	}

	@Override
	public List<GetEmailDto> getEmailsByUser(Long id) {
		List<Email> emails = emailRepository.getEmailsByUser(id);
		List<GetEmailDto> getEmailDtos = new ArrayList<>(emails.size());
		for (Email email : emails) {
			GetEmailDto getEmailDto = EmailAssembler.getEmailDto(email);
			getEmailDtos.add(getEmailDto);
		}
		return getEmailDtos;
	}



}
