package org.factoriaf5.backend.controllers;

import org.factoriaf5.backend.persistence.Book;
import org.factoriaf5.backend.persistence.BooksRepository;
import org.factoriaf5.backend.persistence.Loan;
import org.factoriaf5.backend.persistence.LoansRepository;
import org.factoriaf5.backend.persistence.Member;
import org.factoriaf5.backend.persistence.MembersRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class LoanController {

    @Autowired
    private BooksRepository booksRepository;

    @Autowired
    private MembersRespository membersRepository;

    @Autowired
    private LoansRepository loansRepository;

    @PostMapping("/loans")
    public Loan createLending(@RequestBody LoanRequest request) {

        if (request.getBookId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Book ID not found");
        } else if (request.getMemberId() == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Member ID not found");
        }

        Long idBooks = request.getBookId();
        Book book = booksRepository.findById(idBooks)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found"));

        Long idMember = request.getMemberId();
        Member member = membersRepository.findById(idMember)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Member not found"));

        Loan loan = new Loan();
        loan.setBook(book);;
        loan.setMember(member);
        loan.setLoanDate(request.getLoanDate());
        loan.setReturnDate(request.getReturnDate());

        return loansRepository.save(loan);
    }

}
