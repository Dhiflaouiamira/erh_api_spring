package com.tekup.project_erh.security;


import javax.mail.MessagingException;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.tekup.project_erh.Service.SessionServices;
import com.tekup.project_erh.model.Session;
import com.tekup.project_erh.model.User;


@Service
public class EmailService {
	
	@Autowired
	private SessionServices sessionService;
	@Autowired
	private JavaMailSender javaMailSender;


	
	public void sendHtmlMail(User user) throws MessagingException{
		Session session = sessionService.findByUser(user);
		//check if the user has a token
		
		if(session != null ) {
			String token = session.getToken();
			
			//send the verification email
			MimeMessage message = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setTo(user.getEmail());
			helper.setSubject("email address verification");
			helper.setText("http://localhost:8080/api/auth/activation?token="+token, true);
			javaMailSender.send(message);
			
		}
	}
	
	

}

