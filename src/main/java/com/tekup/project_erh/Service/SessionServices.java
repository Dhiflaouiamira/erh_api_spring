package com.tekup.project_erh.Service;



import com.tekup.project_erh.model.Session;
import com.tekup.project_erh.model.User;

public interface SessionServices {

	Session findByToken(String token);

	Session findByUser(User user);

	void save(User user, String token);
	
}
