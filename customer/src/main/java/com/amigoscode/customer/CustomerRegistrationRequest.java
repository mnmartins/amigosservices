package com.amigoscode.customer;

/*
Using record to get immutability to strings equals
 */
public record CustomerRegistrationRequest(String firstName,
                                          String lastName,
                                          String email) {
}
