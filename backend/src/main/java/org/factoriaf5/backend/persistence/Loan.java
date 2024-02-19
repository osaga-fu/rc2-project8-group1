package org.factoriaf5.backend.persistence;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;


@Entity
public class Loan {

    private String loanDate;
    private String returnDate;

    @EmbeddedId
    private LoanId id;

    @ManyToOne
    @MapsId("bookId")
    private Book book;

    @ManyToOne
    @MapsId("memberId")
    private Member member;
    
    public Loan(String loanDate, String returnDate, LoanId id, Book book, Member member) {
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.id = id;
        this.book = book;
        this.member = member;
    }

    public Loan() {
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public LoanId getId() {
        return id;
    }

    public void setId(LoanId id) {
        this.id = id;
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
    