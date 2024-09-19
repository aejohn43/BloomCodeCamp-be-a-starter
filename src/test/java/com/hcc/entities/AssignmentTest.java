package com.hcc.entities;
import com.hcc.enums.AssignmentEnum;
import com.hcc.enums.AssignmentStatusEnum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssignmentTest {
    @Test
    public void setUserFields_withValidData_FieldsAreSetCorrectly() {
        Long id = 44556165L;
        String status = AssignmentStatusEnum.PENDING_SUBMISSION.toString();
        Integer number = AssignmentEnum.ASSIGNMENT_1.getAssignmentNumber();
        String githubUrl = "github.com/1234";
        String branch = "test";
        String videoUrl = "youtube.com";
        User user = new User();

        Assignment assignment = new Assignment();
        assignment.setUser(user);
        assignment.setBranch(branch);
        assignment.setId(id);
        assignment.setNumber(number);
        assignment.setStatus(status);
        assignment.setGithubUrl(githubUrl);
        assignment.setReviewVideoUrl(videoUrl);

        assertEquals(assignment.getUser(), user);
        assertEquals(assignment.getBranch(), branch);
        assertEquals(assignment.getId(), id);
        assertEquals(assignment.getNumber(), number);
        assertEquals(assignment.getStatus(), status);
        assertEquals(assignment.getGithubUrl(), githubUrl);
        assertEquals(assignment.getReviewVideoUrl(), videoUrl);

    }
}
