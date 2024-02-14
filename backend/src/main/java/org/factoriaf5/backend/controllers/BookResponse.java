package org.factoriaf5.backend.controllers;

public class BookResponse {
    private Long book_id;
    private String title;
    private String author;
    private String isbn;
    private String section_code;

    public BookResponse(Long book_id, String title, String author, String isbn, String section_code) {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.section_code = section_code;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getSectionCode() {
        return section_code;
    }

    public void setSection_code(String section_code) {
        this.section_code = section_code;
    }
}
