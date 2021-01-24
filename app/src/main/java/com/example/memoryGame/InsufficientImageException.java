package com.example.memoryGame;

public class InsufficientImageException extends Exception {
    public InsufficientImageException() {
    }

    public InsufficientImageException(String message) {
        super(message);
    }
}
