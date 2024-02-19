package org.factoriaf5.backend.persistence;

import java.time.LocalDate;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;


@Entity
@Table(name="loans")
public class Loan {

    private LocalDate loanDate;
    private LocalDate returnDate;

    @EmbeddedId
    private LoanId id;

    @ManyToOne
    @MapsId("bookId")
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @MapsId("memberId")
    @JoinColumn(name = "member_id")
    private Member member;

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
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

    public Loan(LocalDate loanDate, LocalDate returnDate, LoanId id, Book book, Member member) {
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.id = id;
        this.book = book;
        this.member = member;
    }

    public Loan() {
    }
    
    
}
    