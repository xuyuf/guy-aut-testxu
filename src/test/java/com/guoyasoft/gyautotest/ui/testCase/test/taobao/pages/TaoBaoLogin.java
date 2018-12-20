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
public class TaoBaoLogin extends BaseUI {
  //通过@FindBy注解定位元素
  @FindBy(xpath = "//a[contains(text(),'密码登录')]")
  //将上面这个元素以私有的方式存在hera这个变量里
  private WebElement hera;
  //通过@FindBy注解定位元素
  @FindBy(xpath ="//input[@id=\"TPL_username_1\"]")
  //将上面这个元素以私有的方式存在textusername这个变量里
  private WebElement textusername;
  //通过@FindBy注解定位元素
  @FindBy(xpath = "//input[@id=\"TPL_password_1\"]")
  //将上面这个元素以私有的方式存在pwd这个变量里
  private WebElement pwd;
  //通过@FindBy注解定位元素
  @FindBy(xpath = "//button[@id=\"J_SubmitStatic\"]")
  //将上面这个元素以私有的方式存在buttonsubmit这个变量里
  private WebElement buttonsubmit;
  //下面是讲上面的元素操作做分装
  @Test
  //公有的权限，无返回值，方法名：testTaoB，（方法名），{方法体}，对于hera的操作是点击
  public void testTaoB(){
    hera.click();
  }
  @Test
  //每个不同方法可以用@Test去分隔开来做分装
  //公有的权限，无返回值，方法名：testTbIongin，（参数列表）{方法体}
  public  void testTbIongin(){
    //对于这个textusername元素的操作是先清空
    textusername.clear();
    //对于这个textusername元素的操作在是填值
    textusername.sendKeys("15888316307");
    //对于pwd这个元素的操作是先清空
    pwd.clear();
    //对于pwd这个元素的操作在是填值
    pwd.sendKeys("xuyf@1103");
  }
  @Test
  //公有的权限，无返回值，方法名：testLickButton，（参数列表）{方法体}，
  //对于buttonsubmit这个元素的操作是点击
  public void testLickButton(){
    buttonsubmit.click();
  }

}
