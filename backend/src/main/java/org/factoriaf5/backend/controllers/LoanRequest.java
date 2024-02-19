package org.factoriaf5.backend.controllers;



public class LoanRequest {
    private Long loanId;
    private String loanDate;
    private String returnDate;
    
    public LoanRequest() {
    }
   
    public LoanRequest(Long loanId, String loanDate, String returnDate) {
        this.loanId = loanId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }

    public Long getLoanId() {
        return loanId;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }
    
}
