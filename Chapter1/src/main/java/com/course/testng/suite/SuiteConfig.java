package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//测试套件配置
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before suite运行了");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after suite运行了");
    }
}
