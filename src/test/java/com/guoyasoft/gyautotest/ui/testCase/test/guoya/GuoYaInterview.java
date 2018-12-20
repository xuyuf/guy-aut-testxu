package com.guoyasoft.gyautotest.ui.testCase.test.guoya;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 16:19
 **/
public class GuoYaInterview extends BaseUI {
  @FindBy(xpath = "//input[@name=\"custmerName\"]")
  private WebElement custmername;
  @FindBy(xpath = "//button[contains(text(),'查询')]")
  private WebElement serch;
  public void testSendkeyCname(String text){
    sendKeys(custmername,text);
  }
  public void testClickSerch(){
    click(serch);

  }

}
