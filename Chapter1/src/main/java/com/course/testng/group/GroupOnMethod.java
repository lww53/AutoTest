package com.course.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * TestNG组测试-方法分组
 */
public class GroupOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端组1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端组2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端4");
    }

    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }
}
