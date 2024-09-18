package com.hcc.entities;

import com.hcc.enums.AuthorityEnum;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AuthorityTest {
    @Test
    public void setAuthorityFields_withValidData_FieldsAreSetCorrectly() {
        Long id = 646848L;
        String authority= AuthorityEnum.ROLE_LEARNER.toString();
        User user = new User();
        Authority authorityObject= new Authority(authority);
        authorityObject.setId(id);
        authorityObject.setUser(user);
        assertEquals(authorityObject.getAuthority(), authority);
        assertEquals(authorityObject.getId(), id);
        assertEquals(authorityObject.getUser(), user);
    }
}
