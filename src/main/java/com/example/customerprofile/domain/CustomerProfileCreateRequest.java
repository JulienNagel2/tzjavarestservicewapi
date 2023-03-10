package com.example.customerprofile.domain;

import javax.validation.constraints.NotBlank;

public class CustomerProfileCreateRequest {

    private final String firstName;

    private final String lastName;

    @NotBlank
    private final String email;

    public CustomerProfileCreateRequest(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        System.out.println("*** In CustomerProfileCreateRequest. email: " + email);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
