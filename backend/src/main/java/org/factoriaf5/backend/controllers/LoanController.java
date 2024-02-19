package org.factoriaf5.backend.controllers;

import java.util.Optional;

import org.factoriaf5.backend.persistence.Book;
import org.factoriaf5.backend.persistence.Loan;
import org.factoriaf5.backend.persistence.LoanId;
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
    public ResponseEntity<LoanResponse> getLoanById (@PathVariable LoandId id){
        Optional<Loan> optionalLoan = repository.findById(LoanId);
        if (optionalLoan.isPresent()) {
            Loan existingLoan = optionalLoan.get();
            LoanResponse loanResponse = new LoanResponse(existingLoan.getLoanId(), existingL.getTitle(),
                    existingLoan.get(), existingLoan.get(), );
            return ResponseEntity.ok(loanResponse);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
     
    @PostMapping("/laons")
    public LoanResponse createLoan(@RequestBody LoanRequest request) {
        Loan loan = new Loan (request.get(), request.get(), request.is());
        Loan savedLoan = repository.save(loan);
        return new LoanResponse(savedLoan.get(), savedLoan.get(), savedLoan.get());
}
}
