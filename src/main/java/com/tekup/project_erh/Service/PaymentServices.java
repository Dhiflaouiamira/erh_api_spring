package com.tekup.project_erh.Service;

import java.util.List;


import com.tekup.project_erh.model.Payment;
public interface PaymentServices {

	
	Payment savePayment(Payment P);
	void deletePayment(Payment P);
	Payment getPayment(Long id);
	List<Payment> getAllPayment();
	
}
