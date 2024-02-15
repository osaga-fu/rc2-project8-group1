package org.factoriaf5.backend.controllers;

public class BookRequest {
    private Long bookId;
    private String title;
    private String author;
    private String isbn;
    private String sectionCode;

    public Long getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getSectionCode() {
        return sectionCode;
    }

    public BookRequest(Long bookId, String title, String author, String isbn, String sectionCode) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.sectionCode = sectionCode;
    }

}
