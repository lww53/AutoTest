package com.course.testng.param;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name = " + name + ";age = " + age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisa",18},
                {"wang",19}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1方法:name = " + name + ";age = " + age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2方法:name = " + name + ";age = " + age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            return new Object[][]{
                    {"zhangsan1",25},
                    {"lisa",30}
            };
        }else if(method.getName().equals("test2")){
            return new Object[][]{
                    {"zhangsan1",90},
                    {"lisa",80}
            };
        }

        return result;
    }
}
