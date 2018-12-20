package com.guoyasoft.gyautotest.ui.testCase.test.taobao.testcases;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.GuoYaInterview;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.Guoya2;
import com.guoyasoft.gyautotest.ui.testCase.test.guoya.GuoyaHome;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 15:18
 **/
public class testGuoya extends BaseUI {

  @Test
  public void testHomeWork() {
    driver.get("http://www.guoyasoft.com:8080/guoya-client/jsp/user/login.jsp");
    GuoyaHome guoyaHome = PageFactory.initElements(driver, GuoyaHome.class);
    guoyaHome.testlusername("xuyf");

    guoyaHome.testlpwd("032463");
    guoyaHome.testLbutton();
    addScreenshot2Allure("111");
    Guoya2 guoya2 = PageFactory.initElements(driver, Guoya2.class);
    guoya2.testClickInterview();
    guoya2.switchToframe(driver);
    GuoYaInterview guoYaInterview = PageFactory.initElements(driver, GuoYaInterview.class);
    guoYaInterview.testSendkeyCname("张继成");
    guoYaInterview.testClickSerch();
sleep(3);
    boolean actul = driver.getPageSource().contains("查询条件");
    Assert.assertEquals(actul,true);

  }

  @Test
  public void testInterview() {
    driver.get("http://www.guoyasoft.com:8080/guoya-client/jsp/user/login.jsp");
    GuoyaHome guoyaHome = PageFactory.initElements(driver, GuoyaHome.class);
    guoyaHome.testlusername("xuyf");
    guoyaHome.testlpwd("032463");
    addScreenshot2Allure("登录");
    guoyaHome.testLbutton();
    Guoya2 guoya2 = PageFactory.initElements(driver, Guoya2.class);
    guoya2.testClickInterview();
    addScreenshot2Allure("点击面试查询");
    guoya2.switchToframe(driver);
    GuoYaInterview guoYaInterview = PageFactory.initElements(driver, GuoYaInterview.class);
    guoYaInterview.testSendkeyCname("雷天晓");
    guoYaInterview.testClickSerch();
    addScreenshot2Allure("查询雷天晓");
    boolean actul = driver.getPageSource().contains("查询条件");
    Assert.assertEquals(actul,true);
  }
}