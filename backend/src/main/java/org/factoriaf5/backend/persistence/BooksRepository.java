package org.factoriaf5.backend.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b WHERE lower (b.title) LIKE lower (:query)" +
        "OR lower(b.author) LIKE lower(:query)" +
        "OR lower(b.isbn) LIKE lower(:query)" +
        "OR lower(b.section_code) LIKE lower(:query)" )
        List<Book> searchBooks(String query);
}
