package org.factoriaf5.backend.controllers;



public class LoanResponse {
    private Long loanId;
    private String loanDate;
    private String returnDate;
    public Long getLoanId() {
        return loanId;
    }
    public String getLoanDate() {
        return loanDate;
    }
    public String getReturnDate() {
        return returnDate;
    }
    public LoanResponse(Long loanId, String loanDate, String returnDate) {
        this.loanId = loanId;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
    }
    public LoanResponse() {
    }

}
