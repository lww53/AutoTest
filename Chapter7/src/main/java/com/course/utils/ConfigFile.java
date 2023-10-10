package com.course.utils;

import com.course.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {
    //加载配置文件
    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);
    public static String getUrl(InterfaceName name){
        String address = bundle.getString("test.url");
        String uri = "";
        //最终测试地址
        String testurl;

        if(name == InterfaceName.GETUSERLIST){
            uri = bundle.getString("getUserList.uri");
        }
        if(name == InterfaceName.LOGIN){
            uri = bundle.getString("login.uri");
        }
        if(name == InterfaceName.ADDUSERINFO){
            uri = bundle.getString("addUser.uri");
        }
        if(name == InterfaceName.GETUSERINFO){
            uri = bundle.getString("getUserInfo.uri");
        }
        if(name == InterfaceName.UPDATEUSERINFO){
            uri = bundle.getString("updateUserInfo.uri");
        }

        testurl = address + uri;
        return testurl;
    }
}
