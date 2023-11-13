package com.tekup.project_erh.Service;

import java.util.List;


import com.tekup.project_erh.model.Recruitment;
public interface RecruitmentServices {

	
	Recruitment saveRecruitment(Recruitment R);
	void deleteRecruitment(Recruitment R);
	Recruitment getRecruitment(Long id);
	List<Recruitment> getAllRecruitment();
	
}
