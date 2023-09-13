package com.course.testng;

import org.testng.annotations.Test;

/**
 * 依赖测试
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test3(){
        System.out.println("test3 run");
    }
}
