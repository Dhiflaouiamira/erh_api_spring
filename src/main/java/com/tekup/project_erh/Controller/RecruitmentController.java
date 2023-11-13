package com.tekup.project_erh.Controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.project_erh.Service.RecruitmentServices;
import com.tekup.project_erh.model.Recruitment;


@RestController
@RequestMapping({"/api/recruitment"})

public class RecruitmentController {
	@Autowired
	private RecruitmentServices recruitmentServices;
	
	
	@GetMapping("/findAll")
	public List<Recruitment> getALLRecruitment(){
		return recruitmentServices.getAllRecruitment();
}
	
	@PostMapping("/Add")
	public Recruitment AddRecruitment(@RequestBody Recruitment P) {
		return recruitmentServices.saveRecruitment(P);
}

      
    @DeleteMapping("/delete")
    public void DeleteRecruitment(@RequestBody Recruitment P) {
    	recruitmentServices.deleteRecruitment(P);
    }
}