package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 11:40
 **/
public class TaoGlasses extends BaseUI {
  @FindBy(xpath = "//a[@data-dataid=\"222888\"]")
  private WebElement fglasses;


@Test
public void testClickFglasses(){
  click(fglasses);
}
}