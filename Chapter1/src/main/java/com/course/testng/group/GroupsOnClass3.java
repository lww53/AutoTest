package com.course.testng.group;

import org.testng.annotations.Test;

/**
 * TestNG组测试-类分组
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){

        System.out.println("GroupsOnClass3中的teacher运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}
