package org.factoriaf5.backend.controllers;

import java.util.Optional;

import org.factoriaf5.backend.persistence.Loan;
import org.factoriaf5.backend.persistence.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class LoanController {

    private LoansRepository repository;
    
    public LoanController(@Autowired LoansRepository repository){
        this.repository = repository;
    }

    @GetMapping("/loans/{id}")
    public ResponseEntity<LoanResponse> getLoanById (@PathVariable Long id){
        Optional<Loan> optionalLoan = repository.findById(id);
        if (optionalLoan.isPresent()) {
            Loan existingLoan = optionalLoan.get();
            LoanResponse loanResponse = new LoanResponse(existingLoan.getLoanId(), existingLoan.getLoanDate(),
                    existingLoan.getReturnDate());
            return ResponseEntity.ok(loanResponse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
     
    @PostMapping("/loans")
    public LoanResponse createLoan(@RequestBody LoanRequest request) {
        Loan loan = new Loan(request.getLoanId(), request.getLoanDate(), request.getReturnDate());
        Loan savedLoan = repository.save(loan);
        return new LoanResponse(savedLoan.getLoanId(), savedLoan.getLoanDate(), savedLoan.getReturnDate());
}
}
