package com.NKLoveLetterApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// this entity connect with our database table
@Entity
public class Letter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "ToWhom cannot be empty") // this is used for this field not empty
    // @NotBlank -> checks if field is not empty or just spaces
    private String toWhom;
    private String fromWhom;
    // @Size -> checks if message has at least 7 characters
    @Size(min = 7, message = "Message must be at least 7 characters")
    private String message;
    private String date;

    // constructors

    public Letter() {

    }

    public Letter(Long id, String toWhom, String fromWhom, String message, String date) {
        this.id = id;
        this.toWhom = toWhom;
        this.fromWhom = fromWhom;
        this.message = message;
        this.date = date;
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToWhom() {
        return toWhom;
    }

    public void setToWhom(String toWhom) {
        this.toWhom = toWhom;
    }

    public String getFromWhom() {
        return fromWhom;
    }

    public void setFromWhom(String fromWhom) {
        this.fromWhom = fromWhom;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
