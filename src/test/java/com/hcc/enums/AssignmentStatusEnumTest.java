package com.hcc.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentStatusEnumTest {
    @Test
    public void testGetStatus() {
        AssignmentStatusEnum assignment = AssignmentStatusEnum.RESUBMITTED;
        assertEquals("Resubmitted", assignment.getStatus());
    }

    @Test
    public void testGetStep() {
        AssignmentStatusEnum assignment = AssignmentStatusEnum.RESUBMITTED;
        assertEquals(6, assignment.getStep());
    }
}
