package com.course.testng.group;

import org.testng.annotations.Test;

/**
 * TestNG组测试-类分组
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2222中的stu1运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2222中的stu2运行");
    }
}
