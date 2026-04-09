package com.demo.service;

import java.util.List;
import com.demo.model.LoanAccount;

public interface LoanService {

    List<LoanAccount> getAllLoans();

    void saveLoan(LoanAccount loan);

    LoanAccount getLoanById(int loanId);

    void updateLoan(LoanAccount loan);

    void deleteLoan(int loanId);

    void payEmi(int loanId, double amount);
}
