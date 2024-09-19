package com.hcc.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentEnumTest {
    @Test
    public void testGetAssignmentName() {
        AssignmentEnum assignment = AssignmentEnum.ASSIGNMENT_1;
        assertEquals("Spring Boot Service", assignment.getAssignmentName());
    }

    @Test
    public void testGetAssignmentNumber() {
        AssignmentEnum assignment = AssignmentEnum.ASSIGNMENT_2;
        assertEquals(2, assignment.getAssignmentNumber());
    }
}
