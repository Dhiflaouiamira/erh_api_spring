package com.tekup.project_erh.Controller;

import java.net.http.HttpRequest;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.project_erh.Service.UserServices;
import com.tekup.project_erh.model.Role;
import com.tekup.project_erh.model.User;
import com.tekup.project_erh.repos.RoleRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/users")
public class UserController {

	
	@Autowired
	private UserServices userServices;
	@Autowired
	private RoleRepository roleRepository;
	
	
	
	@GetMapping
	public List<User> getAllUsers(){
		List<User> List= userServices.getAllUsers();
		return List;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id){
		User user = userServices.getUser(id);
		if (user == null) return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
	    User existingUser = userServices.getUser(id);
	    
	    if (existingUser == null) {
	        return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
	    }
	    
	    // Update user properties with new values from updatedUser
	    existingUser.setFirstName(updatedUser.getFirstName());
	    existingUser.setLastName(updatedUser.getLastName());
	    existingUser.setEmail(updatedUser.getEmail());
	    existingUser.setPassword(updatedUser.getPassword());
	    existingUser.setPhoneNumber(updatedUser.getPhoneNumber());
	    existingUser.setCin(updatedUser.getCin());
	    existingUser.setImage(updatedUser.getImage());
	    existingUser.setDepartment(updatedUser.getDepartment());
	    existingUser.setAddress(updatedUser.getAddress());
	    existingUser.setDateOfBirth(updatedUser.getDateOfBirth());
	    existingUser.setSalary(updatedUser.getSalary());
	    existingUser.setActivated(updatedUser.isActivated());
	    existingUser.setRole(updatedUser.getRole());
	    // Set other properties accordingly

	    userServices.addUser(existingUser); // Or use an update method in your service
	    
	    return new ResponseEntity<>("User updated successfully", HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<?> saveUser( @RequestBody @Valid User user) throws Exception {
		User createdUser = userServices.addUser(user);
		return new ResponseEntity<>(createdUser, HttpStatus.OK);
	}

	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable Long id) {    
	    userServices.deleteUser(id);
	    return new ResponseEntity<>("User deleted successfully", HttpStatus.OK);
	}


}
    
    
    
    
    
    
    
    
    