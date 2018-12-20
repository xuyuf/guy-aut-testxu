package com.guoyasoft.gyautotest.ui.testCase.test.taobao.testcases;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoHome;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoGlasses;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoPhone;
import org.openqa.selenium.support.PageFactory;
import org.springframework.test.context.TestPropertySource;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-19 11:17
 **/
public class testTbPhone extends BaseUI {
  @Test
  public void testTbBuyPhone(){
    driver.get("https://www.taobao.com/");
    TaoBaoHome taoBaoHome = PageFactory.initElements(driver, TaoBaoHome.class);
    taoBaoHome.testseach();
    TaoPhone taoPhone = PageFactory.initElements(driver, TaoPhone.class);
    taoPhone.testclick();
    boolean actul =driver.getPageSource().contains("热销");
    Assert.assertEquals(actul,true);

  }
@Test
  public void testTGlasses(){
    driver.get("https://www.taobao.com");
  TaoGlasses taoGlasses = PageFactory.initElements(driver, TaoGlasses.class);
  taoGlasses.testClickFglasses();

  boolean act =driver.getPageSource().contains("淘宝配饰");
  Assert.assertEquals(act,true);
}

}
