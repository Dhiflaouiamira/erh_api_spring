package com.tekup.project_erh.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.project_erh.model.Entreprise;
import com.tekup.project_erh.repos.EntrepriseRepository;

@Service
public class EntrepriseServicesImpl implements EntrepriseServices{

	@Autowired private EntrepriseRepository EntrepriseRepository;
	
	@Override
	public Entreprise saveEntreprise(Entreprise E) {
		
		return EntrepriseRepository.save(E);
	}

	@Override
	public void deleteEntreprise(Entreprise E) {
		EntrepriseRepository.delete(E);
		
	}

	@Override
	public Entreprise getEntreprise(Long id) {
		
		return EntrepriseRepository.findById(id).get();
	}

	@Override
	public List<Entreprise> getAllEntreprise() {
		
	 return EntrepriseRepository.findAll();
	}

}
