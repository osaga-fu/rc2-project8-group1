package org.factoriaf5.backend.controllers;

import java.util.ArrayList;
import java.util.List;

import org.factoriaf5.backend.persistence.Loan;
import org.factoriaf5.backend.persistence.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping
public class LoanController {

    private final LoansRepository repository;

    public LoanController(@Autowired LoansRepository loanRepository) {
        this.repository = loanRepository;
    }

    @GetMapping("/loans")
    public List<LoanResponse> getLoans() {
        List<LoanResponse> loans = new ArrayList<LoanResponse>();
        List<Loan> loansInDatabase = repository.findAll();
        for (Loan loan : loansInDatabase) {
            loans.add(new LoanResponse(loan.getLoanDate(), loan.getReturnDate(), loan.getBookId(),
                    loan.getMember().getMemberId()));
        }
        return loans;
    }

}
