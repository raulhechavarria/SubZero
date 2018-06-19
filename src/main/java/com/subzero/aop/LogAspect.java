package com.subzero.aop;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.subzero.domian.entity.Log;
import com.subzero.service.LogService;
import com.subzero.service.dto.UpdateUserDto;

@Aspect
@Component
public class LogAspect {
	
	@Autowired
	LogService logService;
	
	@AfterReturning(pointcut="execution(* com.subzero.service.UserService.updateUser(..))", returning="updateUserDto")
	private void updatingLog(UpdateUserDto updateUserDto) {
		Log log = new Log();
		log.setAction("was update the user: " + updateUserDto.getName());
		Date date = new Date();
		date.getTime();
		log.setDate(date);
		logService.saveLog(log);
	}
	
	@Before("execution(* com.subzero.service.UserService.deleteUser(..))")
	private void deletingLog(JoinPoint joinPoint) {
		Object[] obj = joinPoint.getArgs();
		
		Log log = new Log();
		log.setAction("before deleted user with id: " + obj[0]);
		Date date = new Date();
		date.getTime();
		log.setDate(date);
		logService.saveLog(log);
	}
	
	
	/*
	 * @AfterReturning(
   pointcut="execution(public * get*())",
   returning="valor")
   public void log(Object valor) {
   */
	
	
	
	
	/*
	 @After("execution(* com.school.main.service.CourseService.getAllCourse(..))")
public void createLog() {
Log log = new Log();
log.setAction("Create Course");
}
	 */
	
	
	
	/*
	@Around("@annotation(LogExecutionTime)")
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
	    return joinPoint.proceed();
	}
*/
}
