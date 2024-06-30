package com.example.demo.service.exception;

public class TodoNotFoundException extends RuntimeException {
    public TodoNotFoundException(Long id) {
        super("Todo with id " + id + " not found.");
    }
}
