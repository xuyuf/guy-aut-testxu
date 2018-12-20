package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 12:55
 **/
public class TaoBaoHome extends BaseUI {
  //通过 @FindBy注解定位元素
  @FindBy(xpath = "//a[contains(text(),'亲，请登录')]")
  //以私有的方式，将上面的元素存在 loginlink变量里
  private WebElement loginlink;
  //通过 @FindBy注解定位元素
  @FindBy(xpath = "//input[@id=\"q\"]")
  //以私有的方式，将上面的元素存在 seach变量里
  private WebElement seach;
  //通过 @FindBy注解定位元素
  @FindBy(xpath = "//button[contains(text(),'搜索')]")
  //以私有的方式，将上面的元素存在  button变量里
  private WebElement button;
  @FindBy(xpath = "//a[contains(text(),'眼镜')and@data-cid=\"1\"]")
  private WebElement glasses;
  //下面是讲每个元素的操作方法封装
@Test
//共有的，无返回值，testlonin：方法名，（参数列表）{方法体}
  public void testlonin(){
  //点击登录按钮
  click(loginlink);
}
//一个操作分装在不同的一个方法里面用@Test做分隔
@Test
//公有权限，无返回值，方法名：testseach，（参数列表），{方法体}
  public void testseach(){
  //对于这个元素操作先清空
  seach.clear();
  //在填值
  seach.sendKeys("手机");
  //对于这个元素的操作是点击
  click(button);
}
@Test
  public void testGlasses(){
  click(glasses);
}




}
