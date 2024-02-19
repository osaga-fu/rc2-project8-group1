package org.factoriaf5.backend.controllers;

import java.time.LocalDate;

public class LoanResponse {

    private LocalDate loanDate;
    private LocalDate returnDate;
    private Long book_id;
    private Long member_id;
    
    public LocalDate getLoanDate() {
        return loanDate;
    }
    public LocalDate getReturnDate() {
        return returnDate;
    }
    public Long getBook_id() {
        return book_id;
    }
    public Long getMember_id() {
        return member_id;
    }
    public LoanResponse(LocalDate loanDate, LocalDate returnDate, Long book_id, Long member_id) {
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.book_id = book_id;
        this.member_id = member_id;
    }
   
   

    
}