package com.course.model;

import lombok.Data;

@Data
public class GetUserListCase {
    private String userName;
    private String sex;
    private int age;
    private String expected;
}
