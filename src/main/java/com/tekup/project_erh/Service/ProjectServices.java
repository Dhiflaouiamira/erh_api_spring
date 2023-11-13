package com.tekup.project_erh.Service;

import java.util.List;


import com.tekup.project_erh.model.Project;
public interface ProjectServices {

	
	Project saveProject(Project P);
	void deleteProject(Project P);
	Project getProject(Long id);
	List<Project> getAllProject();
	
}
