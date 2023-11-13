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

import com.tekup.project_erh.Service.EntrepriseServices;
import com.tekup.project_erh.model.Entreprise;

@CrossOrigin(origins = "*", allowedHeaders = "*")

@RestController
@RequestMapping({"/api/entreprises"})

public class EntrepriseController {
	@Autowired
	private EntrepriseServices entrepriseServices;
	
	
	@GetMapping
	public List<Entreprise> getALLEntreprise(){
		return entrepriseServices.getAllEntreprise();
}
	
	@PostMapping
	public Entreprise AddEntreprise(@RequestBody Entreprise R) {
		return entrepriseServices.saveEntreprise(R);
}

      
    @DeleteMapping
    public void DeleteEntreprise(@RequestBody Entreprise R) {
    	entrepriseServices.deleteEntreprise(R);
    }
}