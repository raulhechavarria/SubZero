package com.subzero.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.subzero.controller.request.EmailRequest;
import com.subzero.service.EmailService;
import com.subzero.service.dto.GetEmailDto;
import com.subzero.service.dto.SaveEmailDto;
import com.subzero.service.dto.UpdateEmailDto;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@RequestMapping(value = "/email", method = RequestMethod.POST) /// todo este metodo es un endpoint
	public @ResponseBody SaveEmailDto saveEmail(@RequestBody EmailRequest emailRequest) {
		return emailService.saveEmail(emailRequest);
	}

	@RequestMapping(value = "/email", method = RequestMethod.PUT)
	private UpdateEmailDto updateEmail(@RequestBody EmailRequest emailRequest) {
		return emailService.updateEmail(emailRequest);
	}

	@RequestMapping(value = "/email/{id}", method = RequestMethod.GET)
	private GetEmailDto getEmail(@PathVariable Integer id) {
		Long long1 = new Long(id);
		return emailService.getEmail(long1);
	}
	
	@RequestMapping(value = "/email", method = RequestMethod.GET)
	private @ResponseBody List<GetEmailDto> getEmails() {
		return emailService.getEmails();
	}
	
	@RequestMapping(value = "/email/{id}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteEmail(@PathVariable Long id) {
		return emailService.deleteEmail(id);
	}
	
	@RequestMapping(value = "/emails/{userId}", method = RequestMethod.GET)
	public @ResponseBody List<GetEmailDto> getEmailsByUser(@PathVariable Long userId) {
		return emailService.getEmailsByUser(userId);
	}

}
