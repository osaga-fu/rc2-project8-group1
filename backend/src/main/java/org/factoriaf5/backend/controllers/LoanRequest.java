package org.factoriaf5.backend.controllers;

import org.factoriaf5.backend.persistence.LoanId;

public class LoanRequest {
    private LoanId id;
    private String loanDate;
    private String returnDate;
   
    public LoanRequest() {
    }
    public LoanRequest(LoanId id, String loanDate, String returnDate) {
        this.id = id;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }
    public LoanId getId() {
        return id;
    }
    
    
    public String getLoanDate() {
        return loanDate;
    }
  

    public String getReturnDate() {
        return returnDate;
    }


}
