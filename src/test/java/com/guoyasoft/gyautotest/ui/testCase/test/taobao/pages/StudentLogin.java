package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 15:58
 **/
public class StudentLogin extends BaseUI {
  @FindBy(xpath = "//input[@id=\"userName\"]")
  private WebElement username;
  @FindBy(xpath = "//input[@id=\"password\"]")
  private WebElement pwd;
  @FindBy(xpath = "//input[@id=\"checkCode\"]")
  private WebElement code;
  @FindBy(xpath = "//input[@id=\"loginBtn\"]")
  private WebElement button;
  @Test
  public void testStlogin(){
    clean(username);
    username.sendKeys("xuyf");
    clean(pwd);
    pwd.sendKeys("032463");

  }
  public void testButton(){
    click(button);
  }

}
