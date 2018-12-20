package com.guoyasoft.gyautotest.ui.testCase.test.taobao.testcases;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoHome;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 12:56
 **/
public class testTbLogin extends BaseUI {
  //这个是业务操作界面
@Test
//公有的权限，无返回值，方法名:testLogin,(参数列表），{方法体}
  public void testLogin(){
  // driver.get打开网页
  driver.get("https://www.taobao.com");
  //先对这个淘宝页面初始化（PageFactory）存到taoBaoHome这个变量中
  TaoBaoHome taoBaoHome = PageFactory.initElements(driver, TaoBaoHome.class);
  taoBaoHome.testlonin();

  TaoBaoLogin taoBaoLogin = PageFactory.initElements(driver, TaoBaoLogin.class);
  taoBaoLogin.testTaoB();
  taoBaoLogin.testTbIongin();
  taoBaoLogin.testLickButton();
  boolean actual =driver.getPageSource().contains("我的淘宝");
  Assert.assertEquals(actual,true);

}
}
