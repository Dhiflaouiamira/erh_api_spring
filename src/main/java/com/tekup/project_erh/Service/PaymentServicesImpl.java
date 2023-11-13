package com.tekup.project_erh.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.project_erh.model.Payment;
import com.tekup.project_erh.repos.PaymentRepository;

@Service
public class PaymentServicesImpl implements PaymentServices{

	@Autowired private PaymentRepository PaymentRepository;
	
	@Override
	public Payment savePayment(Payment P) {
		
		return PaymentRepository.save(P);
	}

	@Override
	public void deletePayment(Payment P) {
		PaymentRepository.delete(P);
		
	}

	@Override
	public Payment getPayment(Long id) {
		
		return PaymentRepository.findById(id).get();
	}

	@Override
	public List<Payment> getAllPayment() {
		
	 return PaymentRepository.findAll();
	}

}
