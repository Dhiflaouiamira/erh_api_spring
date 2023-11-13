package com.tekup.project_erh.Controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.project_erh.Service.AbsenceServices;
import com.tekup.project_erh.model.Absence;


@RestController
@RequestMapping({"/api/absence"})

public class AbsenceController {
	@Autowired
	private AbsenceServices absenceServices;
	
	
	@GetMapping("/findAll")
	public List<Absence> getALLAbsence(){
		return absenceServices.getAllAbsence();
}
	
	@PostMapping("/Add")
	public Absence AddAbsence(@RequestBody Absence A) {
		return absenceServices.saveAbsence(A);
}

      
    @DeleteMapping("/delete")
    public void DeleteAbsence(@RequestBody Absence A) {
    	absenceServices.deleteAbsence(A);
    }
}