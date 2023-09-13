package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.printf("Tread ID : %s%n",Thread.currentThread().getId());
        System.out.println("这是测试用例1");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是在测试方法前运行的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试方法后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类运行前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是在类运行后运行的");
    }

    //测试套件是在类运行之前
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件");
    }
}
