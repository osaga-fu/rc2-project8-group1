package org.factoriaf5.backend.persistence;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class LoanId implements Serializable {

    private Long bookId;
    private Long memberId;

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public LoanId(Long bookId, Long memberId) {
        this.bookId = bookId;
        this.memberId = memberId;
    }

    public LoanId() {
    }

}
