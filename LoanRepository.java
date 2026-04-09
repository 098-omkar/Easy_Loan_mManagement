package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.LoanAccount;

@Repository
public interface LoanRepository extends JpaRepository<LoanAccount, Integer>{

}
