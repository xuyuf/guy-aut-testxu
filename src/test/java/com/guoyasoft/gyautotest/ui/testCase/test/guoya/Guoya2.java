package com.guoyasoft.gyautotest.ui.testCase.test.guoya;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 15:41
 **/
public class Guoya2 extends BaseUI {
  @FindBy(xpath = "//a[contains(text(),'作业检查')]")
  private WebElement work;
  @FindBy(xpath = "//a[contains(text(),'上传总结')]")
  private WebElement upload;
  @FindBy(xpath = "//a[contains(text(),'面试查询')]")
  private WebElement interview;
  @FindBy(xpath = "//iframe[@id=\"iframepage\"]")
  private WebElement iframe;
  @Test
  public void testClickWork(){
    click(work);
  }

  public void testClickUpload(){
    click(upload);
  }

  public void testClickInterview(){
    click(interview);
  }

  public void switchToframe(WebDriver driver){
    driver.switchTo().frame(iframe);
  }

}
