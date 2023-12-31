package com.tekup.project_erh.objects;


import java.io.Serializable;


import com.tekup.project_erh.model.User;

public class AuthenticationResponse implements Serializable {

    private final String jwt;
    private final User user;

    public AuthenticationResponse(String jwt, User user) {
        this.jwt = jwt;
        this.user = user;

    }

    public String getJwt() {
        return jwt;
    }


	public User getUser() {
		return user;
	}
    
}
