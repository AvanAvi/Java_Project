package com.library.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    
    @Test
    void shouldCreateStudentWithValidData() {
        Student student = new Student("12345", "John Doe", "Computer Science");
        
        assertEquals("12345", student.getId());
        assertEquals("John Doe", student.getName());
        assertEquals("Computer Science", student.getDepartment());
        assertTrue(student.getBorrowedBooks().isEmpty());
    }

    @Test
    void shouldNotCreateStudentWithEmptyId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Student("", "John Doe", "Computer Science");
        });
    }
}