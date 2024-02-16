package org.factoriaf5.backend.controllers;

public class MemberRequest {
    private Long memberId;
    private String firstName;
    private String lastName;
    private String dni;
    private String email;
    private boolean loaned;

    public MemberRequest(Long memberId, String firstName, String lastName, String dni, String email, boolean loaned) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dni = dni;
        this.email = email;
        this.loaned = loaned;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public boolean isLoaned() {
        return loaned;
    }

}
