package com.course.testng;

import org.testng.annotations.Test;

/**
 * 异常测试
 */
public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个正常的异常测试");
        throw new RuntimeException();
    }
}
