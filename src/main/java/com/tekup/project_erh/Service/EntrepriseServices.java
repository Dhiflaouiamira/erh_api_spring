package com.tekup.project_erh.Service;

import java.util.List;


import com.tekup.project_erh.model.Entreprise;
public interface EntrepriseServices {

	
	Entreprise saveEntreprise(Entreprise E);
	void deleteEntreprise(Entreprise E);
	Entreprise getEntreprise(Long id);
	List<Entreprise> getAllEntreprise();
	
}
