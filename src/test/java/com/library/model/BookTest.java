package com.library.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    
    @Test
    void shouldCreateBookWithValidData() {
        Book book = new Book("1234567890", "Clean Code", "Robert Martin");
        
        assertEquals("1234567890", book.getIsbn());
        assertEquals("Clean Code", book.getTitle());
        assertEquals("Robert Martin", book.getAuthor());
        assertTrue(book.isAvailable());
    }

    @Test
    void shouldNotCreateBookWithEmptyIsbn() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Book("", "Clean Code", "Robert Martin");
        });
    }
}