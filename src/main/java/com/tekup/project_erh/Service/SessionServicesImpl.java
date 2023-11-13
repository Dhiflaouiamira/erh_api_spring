package com.tekup.project_erh.Service;

import java.sql.Timestamp;

import java.util.Calendar;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.project_erh.model.Session;
import com.tekup.project_erh.model.User;
import com.tekup.project_erh.repos.SessionRepository;

@Service
public class SessionServicesImpl implements SessionServices {
	
  @Autowired 
  private SessionRepository sessionRepository;
	
  
  	@Override
  	@Transactional
	public Session findByToken(String token) {
		return sessionRepository.findByToken(token);
	}
	
  	@Override
	@Transactional
	public Session findByUser(User user) {
		return sessionRepository.findByUser(user);
	}
	
  	@Override
	@Transactional
	public void save(User user, String token) {
		Session session = new Session(token, user);
		//set expiry date to 24 hours
		session.setExpirationDate(calculateExpiryDate(24*60));
		sessionRepository.save(session);
	}
	
	// Calculate expiry date 
	private Timestamp calculateExpiryDate(int expiryTimeInMinutes) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, expiryTimeInMinutes);
		return new Timestamp(cal.getTime().getTime());
	}
}
