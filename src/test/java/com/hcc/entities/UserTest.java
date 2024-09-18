package com.hcc.entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void setUserFields_withValidData_FieldsAreSetCorrectly() {
        Long id = 44556165L;
        LocalDate cohortStartDate = LocalDate.now();
        String username = "username";
        String password = "password";
        User user = new User(cohortStartDate, username, password);
        user.setId(id);
        assertEquals(user.getUsername(), username);
        assertEquals(user.getPassword(), password);
        assertEquals(user.getCohortStartDate(), cohortStartDate);
        assertEquals(user.getId(), id);
    }
}
