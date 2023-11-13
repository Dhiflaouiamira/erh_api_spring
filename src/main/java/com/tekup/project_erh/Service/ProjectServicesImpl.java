package com.tekup.project_erh.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.project_erh.model.Project;
import com.tekup.project_erh.repos.ProjectRepository;

@Service
public class ProjectServicesImpl implements ProjectServices{

	@Autowired private ProjectRepository ProjectRepository;
	
	@Override
	public Project saveProject(Project P) {
		
		return ProjectRepository.save(P);
	}

	@Override
	public void deleteProject(Project P) {
		ProjectRepository.delete(P);
		
	}

	@Override
	public Project getProject(Long id) {
		
		return ProjectRepository.findById(id).get();
	}

	@Override
	public List<Project> getAllProject() {
		
	 return ProjectRepository.findAll();
	}

}
