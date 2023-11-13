package com.tekup.project_erh.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.project_erh.model.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Long>{

}
