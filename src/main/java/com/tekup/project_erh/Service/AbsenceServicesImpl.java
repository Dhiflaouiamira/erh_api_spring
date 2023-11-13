package com.tekup.project_erh.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.project_erh.model.Absence;
import com.tekup.project_erh.repos.AbsenceRepository;

@Service
public class AbsenceServicesImpl implements AbsenceServices{

	@Autowired private AbsenceRepository AbsenceRepository;
	
	@Override
	public Absence saveAbsence(Absence A) {
		
		return AbsenceRepository.save(A);
	}

	@Override
	public void deleteAbsence(Absence A) {
		AbsenceRepository.delete(A);
		
	}

	@Override
	public Absence getAbsence(Long id) {
		
		return AbsenceRepository.findById(id).get();
	}

	@Override
	public List<Absence> getAllAbsence() {
		
	 return AbsenceRepository.findAll();
	}

}
