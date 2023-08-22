package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.PaymentMode;

public interface PaymentModeRepository extends JpaRepository<PaymentMode, Integer> {

}
