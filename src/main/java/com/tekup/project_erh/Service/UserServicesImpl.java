package com.tekup.project_erh.Service;

import java.util.List;


import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tekup.project_erh.model.User;
import com.tekup.project_erh.repos.UserRepository;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired 
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public User addUser(User user) {
		String password = passwordEncoder.encode(user.getPassword());
		user.setPassword(password);
		user.setActivated(true);
		Optional<User> savedUser = Optional.of(userRepository.save(user));
		return savedUser.get();
	}
	
	@Override
	public Optional<User> findUserByEmail(String email){
		return userRepository.findUserByEmail(email);
	}
	
	@Override
	public boolean userExist(String email) {
		return findUserByEmail(email).isPresent();
	}

	@Override
	public void deleteUser(Long U) {
		userRepository.deleteById(U);
		
	}

	 @Override
	    public User getUser(Long id) {
	        return userRepository.findById(id).get();
	    }

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();

	}

	@Override
	public List<User> findActivatedUsers(boolean activated) {
		
		return userRepository.findUserByActivated(activated);
	}
    
	
}
