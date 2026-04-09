package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LoanRepository;
import com.demo.model.LoanAccount;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    LoanRepository repo;

    @Override
    public List<LoanAccount> getAllLoans() {
        return repo.findAll();
    }

    @Override
    public void saveLoan(LoanAccount loan) {
        repo.save(loan);
    }

    @Override
    public LoanAccount getLoanById(int loanId) {
        return repo.findById(loanId).orElse(null);
    }

    @Override
    public void updateLoan(LoanAccount loan) {
        repo.save(loan);
    }

    @Override
    public void deleteLoan(int loanId) {
        repo.deleteById(loanId);
    }

    @Override
    public void payEmi(int loanId, double amount) {

        LoanAccount loan = repo.findById(loanId).orElse(null);

        if (loan != null) {
            double paid = loan.getEmiPaid();
            loan.setEmiPaid(paid + amount);
            repo.save(loan);
        }
    }
}
