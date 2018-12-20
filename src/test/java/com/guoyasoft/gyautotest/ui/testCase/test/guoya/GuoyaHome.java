package com.guoyasoft.gyautotest.ui.testCase.test.guoya;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 15:26
 **/
public class GuoyaHome extends BaseUI {
  // 通过@FindBy定位元素
  @FindBy(xpath = "//input[@id=\"userName\"]")
  private WebElement lusername;
  @FindBy(xpath = "//input[@id=\"password\"]")
  private WebElement lpwd;
  @FindBy(xpath = "//input[@id=\"loginBtn\"]")
  private WebElement lbutton;
  //对上面封装的元素进行操作
  @Test
  public void testlusername(String text){
  clean(lusername);
  sendKeys(lusername,"xuyf");

  }
  public void testlpwd(String text){
    clean(lpwd);
    sendKeys(lpwd,"032463");

  }
  public void testLbutton(){
    click(lbutton);
  }


}
