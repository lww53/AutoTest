package com.course.cases;

import com.course.config.TestConfig;
import com.course.model.GetUserInfoCase;
import com.course.model.GetUserListCase;
import com.course.utils.DataBaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetUserInfoListTest {
    @Test(dependsOnGroups = "loginTrue",description = "获取用户id为1的用户信息")
    public void getUserInfoList() throws IOException {
        SqlSession session = DataBaseUtil.getSqlSession();
        GetUserListCase getUserListCase = session.selectOne("getUserListCase",1);
        System.out.println(getUserListCase.toString());
        System.out.println(TestConfig.getUserListUrl);
    }
}
