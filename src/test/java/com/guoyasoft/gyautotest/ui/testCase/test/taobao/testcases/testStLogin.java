package com.guoyasoft.gyautotest.ui.testCase.test.taobao.testcases;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.StudentLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 16:11
 **/
public class testStLogin extends BaseUI {
  @Test
  public void testStudent(){
    driver.get("http://www.guoyasoft.com:8080/guoya-client/jsp/user/login.jsp");
    StudentLogin studentLogin = PageFactory.initElements(driver, StudentLogin.class);
    studentLogin.testStlogin();
    studentLogin.testButton();
    boolean actul = driver.getPageSource().contains("果芽软件");
    Assert.assertEquals(actul,true);
  }

}
