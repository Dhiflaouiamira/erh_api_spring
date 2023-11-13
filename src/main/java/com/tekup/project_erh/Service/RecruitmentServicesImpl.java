package com.tekup.project_erh.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.project_erh.model.Recruitment;
import com.tekup.project_erh.repos.RecruitmentRepository;

@Service
public class RecruitmentServicesImpl implements RecruitmentServices{

	@Autowired private RecruitmentRepository RecruitmentRepository;
	
	@Override
	public Recruitment saveRecruitment(Recruitment P) {
		
		return RecruitmentRepository.save(P);
	}

	@Override
	public void deleteRecruitment(Recruitment P) {
		RecruitmentRepository.delete(P);
		
	}

	@Override
	public Recruitment getRecruitment(Long id) {
		
		return RecruitmentRepository.findById(id).get();
	}

	@Override
	public List<Recruitment> getAllRecruitment() {
		
	 return RecruitmentRepository.findAll();
	}

}
