package com.course.model;

import lombok.Data;

@Data
public class User {
    private String username;
    private String password;
    private int age;
    private int id;
    private String sex;
    private String permission;
    private String isDelete;

    @Override
    public String toString(){
        return("id:" + id + "," +
                "username:" + username + "," +
                "password:" + password + "," +
                "sex:" + sex + "," +
                "permission:" + permission + "," +
                "isDelete:" + isDelete + "," +
                "age:" + age + ",");
    }
}
