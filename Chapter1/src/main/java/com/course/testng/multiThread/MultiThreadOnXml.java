package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * 多线程测试使用xml文件
 */
public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Tread ID : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Tread ID : %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("Tread ID : %s%n",Thread.currentThread().getId());
    }
}
