package com.tekup.project_erh.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import  com.tekup.project_erh.model.Session;
import  com.tekup.project_erh.model.User;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{

	Session findByToken(String token);
	Session findByUser(User user);
}
