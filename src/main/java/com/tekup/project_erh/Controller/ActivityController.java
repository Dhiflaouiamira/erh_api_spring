package com.tekup.project_erh.Controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.project_erh.Service.ActivityServices;
import com.tekup.project_erh.model.Activity;


@RestController
@RequestMapping({"/api/activity"})

public class ActivityController {
	@Autowired
	private ActivityServices activityServices;
	
	
	@GetMapping
	public List<Activity> getALLActivity(){
		return activityServices.getAllActivity();
}
	
	@PostMapping
	public Activity AddActivity(@RequestBody Activity A) {
		return activityServices.saveActivity(A);
}

      
    @DeleteMapping
    public void DeleteActivity(@RequestBody Activity A) {
    	activityServices.deleteActivity(A);
    }
}