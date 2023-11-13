package com.tekup.project_erh.Service;

import java.util.List;


import com.tekup.project_erh.model.Absence;
public interface AbsenceServices {

	
	Absence saveAbsence(Absence A);
	void deleteAbsence(Absence A);
	Absence getAbsence(Long id);
	List<Absence> getAllAbsence();
	
}
