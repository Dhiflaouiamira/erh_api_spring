package com.tekup.project_erh.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.project_erh.model.Activity;
import com.tekup.project_erh.repos.ActivityRepository;

@Service
public class ActivityServicesImpl implements ActivityServices{

	@Autowired private ActivityRepository ActivityRepository;
	
	@Override
	public Activity saveActivity(Activity A) {
		
		return ActivityRepository.save(A);
	}

	@Override
	public void deleteActivity(Activity A) {
		ActivityRepository.delete(A);
		
	}

	@Override
	public Activity getActivity(Long id) {
		
		return ActivityRepository.findById(id).get();
	}

	@Override
	public List<Activity> getAllActivity() {
		
	 return ActivityRepository.findAll();
	}

}
