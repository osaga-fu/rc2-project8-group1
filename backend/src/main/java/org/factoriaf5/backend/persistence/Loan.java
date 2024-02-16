package org.factoriaf5.backend.persistence;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;


@Entity
public class Loan {

    private String loanData;
    private String returnData;

    @EmbeddedId
    private LoanId id;

    @ManyToOne
    @MapsId("bookId")
    private Book book;

    @ManyToOne
    @MapsId("memberId")
    private Member member;
    
    public Loan() {
    }

    public Loan(String loanData, String returnData, Book book, Member member) {
        this.loanData = loanData;
        this.returnData = returnData;
        this.book = book;
        this.member = member;
    }

    public String getLoanData() {
        return loanData;
    }

    public void setLoanData(String loanData) {
        this.loanData = loanData;
    }

    public String getReturnData() {
        return returnData;
    }

    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
