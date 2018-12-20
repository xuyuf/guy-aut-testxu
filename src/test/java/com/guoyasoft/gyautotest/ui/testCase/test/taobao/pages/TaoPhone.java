package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 11:10
 **/
public class TaoPhone extends BaseUI {
  @FindBy(xpath = "//img[@alt=\"苹果 iPhone 8 Plus \"]")
  private WebElement phone8;
  @FindBy(xpath = "//a[contains(text(),'销量')]")
  private WebElement sale;


@Test
  public void testclick(){
  click(phone8);
}
@Test
  public void testSale(){
  clean(sale);
}
}
