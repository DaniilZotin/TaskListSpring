package com.example.tasklist.domain.exception;

/**
 * Ця помилка буде падати коли користувач, наприклад буде намагатись достукатись до чужої задачі,
 * наприклад користувач з id 1 буде брати задачу користувача з id 2
 */
public class AccessDeniedException extends RuntimeException{
    public AccessDeniedException() {
        super();
    }
}
