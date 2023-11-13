package com.tekup.project_erh.Service;

import java.util.List;


import com.tekup.project_erh.model.Activity;
public interface ActivityServices {

	
	Activity saveActivity(Activity A);
	void deleteActivity(Activity A);
	Activity getActivity(Long id);
	List<Activity> getAllActivity();
	
}
