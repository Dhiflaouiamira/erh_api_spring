package com.tekup.project_erh.Controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.project_erh.Service.PaymentServices;
import com.tekup.project_erh.model.Payment;


@RestController
@RequestMapping({"/api/payment"})

public class PaymentController {
	@Autowired
	private PaymentServices paymentServices;
	
	
	@GetMapping("/findAll")
	public List<Payment> getALLPayment(){
		return paymentServices.getAllPayment();
}
	
	@PostMapping("/Add")
	public Payment AddPayment(@RequestBody Payment P) {
		return paymentServices.savePayment(P);
}

      
    @DeleteMapping("/delete")
    public void DeletePayment(@RequestBody Payment P) {
    	paymentServices.deletePayment(P);
    }
}