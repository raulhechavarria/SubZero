package com.subzero.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.subzero.domian.entity.Log;
import com.subzero.domian.entity.User;
import com.subzero.repository.LogRepository;
import com.subzero.service.LogService;

@Service
public class LogServicesImpl implements LogService {

	@Autowired
	private LogRepository logRepository;
	
	@Override
	public Log saveLog(Log log) {
		return logRepository.save(log);
	}

}
