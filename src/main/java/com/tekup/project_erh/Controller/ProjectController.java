package com.tekup.project_erh.Controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.project_erh.Service.ProjectServices;
import com.tekup.project_erh.model.Project;

@CrossOrigin(origins = "*", allowedHeaders = "*")

@RestController
@RequestMapping({"/api/projects"})

public class ProjectController {
	@Autowired
	private ProjectServices projectServices;
	
	
	@GetMapping
	public List<Project> getALLProject(){
		return projectServices.getAllProject();
}
	
	@PostMapping
	public Project AddProject(@RequestBody Project P) {
		return projectServices.saveProject(P);
}

      
    @DeleteMapping
    public void DeleteProject(@RequestBody Project P) {
    	projectServices.deleteProject(P);
    }
}