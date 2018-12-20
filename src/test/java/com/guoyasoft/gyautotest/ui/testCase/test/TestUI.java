package com.guoyasoft.gyautotest.ui.testCase.test;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.Action;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-13 10:18
 **/
//公有的权限，对象是class取名叫TestUI继承了BaseUI里的所有方法
public class TestUI extends BaseUI {
  //注解（给程序员看的）
  @Test
  //公有的权限，无返回值类型，
public void testTextinput(){
    // driver.get打开百度这个网页
  driver.get("https://www.taobao.com/");
  // driver.findElement定位元素通过xpath方法定位淘宝的输入框
  WebElement test = driver.findElement(By.xpath("//input[@id=\"q\"]"));
  //对这个输入框的操作先清空
  test.clear();
  //对这个输入框进行填值
  test.sendKeys("帆布包");
  //休息2秒
  sleep(2);

}
@Test
public void testButton(){
  testTextinput();
  WebElement button = driver.findElement(By.xpath("//button[contains(text(),'搜索')]"));
  button.click();
  sleep(2);

}
@Test
public void herf(){
    //打开网页
    driver.get("https://www.taobao.com/");
    //定位元素
  WebElement herf = driver
      .findElement(By.xpath("//li[@aria-label=\"查看更多\"]/a[contains(text(),'女装')]"));
  //操作
  //herf.click();
sleep(2);
//ctrl+点击
  //1.在代码里Actions封装了鼠标的所有操作，使用这个类我们需要新建一个实例，所以new新建并取名为actions
  //Actions actions = new Actions(driver);
  //对这个变量actions的操作有先按下去，在点击链接之后鼠标回弹，在展现
  //actions.keyDown(Keys.CONTROL).click(herf).keyUp(Keys.CONTROL).perform();
sleep(2);
//shift+点击
  //1.在代码里Actions里封装了鼠标的所有操作，使用这个类我们需要新建一个实例，所以new新建并取名为actions
  Actions actions = new Actions(driver);
  //鼠标这个变量叫actions我们的操作有1.按shift，点击超链接hera在鼠标回弹shift，之后再展现
  actions.keyDown(Keys.SHIFT).click(herf).keyUp(Keys.SHIFT).perform();
  sleep(2);

}
@Test
  public void select(){
    //driver.get打开网址
    driver.get("file:///C:/Users/Administrator/Desktop/demo(2).html");
    // driver.findElement这里是xpath轴定位元素
  WebElement select = driver.findElement(By.xpath("//select"));
  //对这个selects的操作
  //1.对于下拉框的操作封装在Select这个类里，我们需要先new一个实例，这里取名为select2
  Select select2=new Select(select);
  //2.下拉框有多个选项，这里我们是通过selectByIndex（下拉框的序号）代码0代表第一个
  select2.selectByIndex(0);
  //休息一下
  sleep(2);
  //这里我们是通过selectByVisibleText（下拉框的文本域）下拉框有橘子
  select2.selectByVisibleText("橘子");
  //休息一下
  sleep(2);
  //通过select这个下拉框查看源代码，通过Value的值去选择
  select2.selectByValue("chengzi");
  //休息一下
  sleep(2);


}
@Test
//日期控件
  public void date(){
    // driver.get打开网页
  driver.get("file:///C:/Users/Administrator/Desktop/demo(2).html");
  //是把js代码存起来
  String js = "var xpath = \"//input[@type='date']\";var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();element.value=\"2018-12-13\";";
  //强制转化js代码driver告诉程序那个浏览器的代码
  JavascriptExecutor jsdrver=(JavascriptExecutor)driver;
  //将jsdrver里面的代码解析（executeScript，脚本，(js)代码）
  jsdrver.executeScript(js);
}
@Test
  public void time(){
    // driver.get打开网页
    driver.get("file:///C:/Users/Administrator/Desktop/demo(2).html");
//将代码存到js这个变量中
  String js = "var xpath = \"//input[@type='time']\";var element = document.evaluate(xpath,document,null,XPathResult.ANY_TYPE,null).iterateNext();element.value=\"15:30\";";
  //强制转换js代码并告诉它你的网页driver
    JavascriptExecutor jss=(JavascriptExecutor)driver;
    //逐个解释executeScript脚本(js)存放js代码
    jss.executeScript(js);

}
@Test
  public void testnavigate(){
    //driver.get打开百度网页
  driver.get("https://www.taobao.com/");
  //休息2秒
  sleep(2);
  //driver.get打开京东的网页
  driver.get("https://www.jd.com/");
  //休息2秒
  sleep(2);
  //driver.get打开苏宁的网页
  driver.get("http://ju.suning.com/");
  //休息两秒
  sleep(2);
  //导航栏点击后退
  driver.navigate().back();
  //休息2秒
  sleep(2);
  //导航栏点击前进
  driver.navigate().forward();
  //休息2秒
  sleep(2);
  //导航栏点击后退
  driver.navigate().back();
  //休息2秒
  sleep(2);
  //导航栏刷新
  driver.navigate().refresh();
  //休息2秒
  sleep(2);
  //通过导航栏跳转到唯品会页面
  driver.navigate().to("https://www.vip.com/");
}
@Test
  public void login(){
    //打开网页
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
    //定位用户名元素
  WebElement login = driver.findElement(By.xpath("//input[@id='userName']"));
  //对于用户名这个框的操作
  //先请空
  login.clear();
  //在填值
  login.sendKeys("xuyf");
  //休息2秒
  sleep(2);
  //定位密码框的元素
  WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
  //对密码框的操作
  //清空
  password.clear();
  //填值
  password.sendKeys("11032463");
  //休息2秒
  sleep(2);
  WebElement code = driver.findElement(By.xpath("//input[@id=\"checkCode\"]"));
  code.clear();
  code.sendKeys("12345");
  sleep(2);
  WebElement button = driver.findElement(By.xpath("//input[@id=\"loginBtn\"]"));
  button.click();
}
@Test
  public void textSignUp(){
    //获取这个网页
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/signUp.jsp");
    //定位元素
  WebElement username = driver.findElement(By.xpath("//input[@id='userName']"));
  //清空，填值
  username.clear();
  username.sendKeys("xufei1103");
  WebElement realname = driver.findElement(By.xpath("//input[@id=\"realName\"]"));
  //清空，填值
  realname.clear();
  realname.sendKeys("徐雨菲");
  WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
  password.clear();
  password.sendKeys("xuyf11");
  WebElement password2 = driver.findElement(By.xpath("//input[@id=\"password2\"]"));
  password2.clear();
  password2.sendKeys("xuyf11");
  WebElement phone = driver.findElement(By.xpath("//input[@id=\"phone\"]"));
  phone.clear();
  phone.sendKeys("15888316307");
  WebElement age = driver.findElement(By.xpath("//input[@id=\"age\"]"));
  age.clear();
  age.sendKeys("25");
  WebElement checkcode = driver.findElement(By.xpath("//input[@id=\"checkCode\"]"));
  checkcode.clear();
  checkcode.sendKeys("1234");
  WebElement submitbtn = driver.findElement(By.xpath("//input[@id=\"submitBtn\"]"));
  submitbtn.click();
}
@Test
  public void textAlert(){
    textSignUp();
  Alert alert= driver.switchTo().alert();
  //同意
  alert.accept();
  //取消
 // alert.dismiss();
  //展现文本
  //alert.getText()
sleep(2);
}
@Test
//权限 返回值 方法名：Windoeswich窗口切换 （）：参数列表
  public void testWindoeswich(){//{ 方法体}
    //获取淘宝网址
    driver.get("https://www.taobao.com/");
    //打开童装玩具这个链接
 driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'女装')]")).click();
 //打开孕产这个链接
 driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'男装')]")).click();
 //打开家电这个链接
 driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'内衣')]")).click();
 //打开用品这个链接
 driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'鞋靴')]")).click();
 //获取窗口所有的句柄，（getWindowHandles，句柄）定义变量为： Handles
  Set<String> Handles = driver.getWindowHandles();
  //for循环遍历set（set：上面set这个容器中的句柄）集合中的句柄
  for (String h:Handles){
    //根据句柄切换窗口
    driver.switchTo().window(h);
    //休息2秒
    sleep(2);
    //if做判断根据窗口标题来判断是哪个窗口
    if (driver.getTitle().contains("淘宝电场")) {
      //终止循环
      break;
    }
  }
  sleep(2);
  }
  @Test
  public void testContainer(){
    //定义一个数组，取名为strings
    String[] strings={"11","22","33","44","55"};
    //声明数组的另一种方法，这个是定义strings1这个数组的长度为5
    //String[]strings1 =new String[5];
    //将strings这个数组的第二个值改为“66”
    strings[1]="66";
    //打印输出（快捷键sout)
    System.out.println(strings[1]);
  }
  @Test
public void testshuzu(){
    String[] string={"11","22"};
    string[1]="33";
  System.out.println(string[1]);
  //二维数组取名为str1，里面有三个一维数组
  String[][] str1 ={{"1","2","3","4"},{"11","22","33"},{"111","222","333"}};
  //另外一种方法[]第一个代表一维数组里面的值得长度（以最大填），[]第二个代表二位数组的长度，里面有几个一维的数组
  //String[][] str2 =new String[4][3];
    //打印出第二个一维数组中的第一个值“11”
    System.out.println(str1[1][0]);
    //声明一个二维数组
   // list：接口，<>:泛型，String：每个子元素的类型，list：变量名，=：赋值符，ArrayList：实现类，（）：构造方法
   List<String>list  = new ArrayList<String>();
   //在列表最后添加数据
    list.add("111");
    list.add("222");
    list.add("333");
    //在列表某个位置添加数据
    list.add(1,"334");
    //打印输出第二值
    System.out.println(list.get(1));
    //打印输出第三个值
    System.out.println(list.get(2));
    //打印输出第一个值
    System.out.println(list.get(0));
    //创建一个Set
    Set<String>set =new HashSet<String>();
    //add:存
    set.add("111");
    set.add("222");
    set.add("333");
    //通过for循环遍历，(String s:set)：String 这个变量将上面set的值存到s中
    for (String s:set){
      //打印输出，s这个值
      System.out.println(s);
      //新建一个map
      Map<String, String> map = new HashMap<String, String>();
      // put：存（key不能重复）
      map.put("姓名", "徐雨菲");
      map.put("性别", "女");
      map.put("年龄", "19");
      //get:取
      map.get("姓名");
      //打印输出取得值
      System.out.println(map.get("姓名"));
      //remove：删
      map.remove("姓名");
      //打印输出
      System.out.println(map.get("姓名"));
    }


  }
@Test
  public void testIfram(){
    //打开网址
    driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
    //定位元素
  driver.findElement(By.xpath("//a[contains(text(),'课程查询')]")).click();
  //定位到iframe框
  WebElement iframe = driver.findElement(By.xpath("//iframe"));
  sleep(3);
  //切换到iframe框
  driver.switchTo().frame(iframe);
  //操作iframe框里面的元素
  driver.findElement(By.xpath("//input[@name=\"className\"]")).sendKeys("1809");
  sleep(3);
  driver.findElement(By.xpath("//input[@name=\"teacherName\"]")).sendKeys("薛彭磊");
  sleep(3);

  driver.findElement(By.xpath("//input[@type=\"reset\"]"));
  sleep(3);

  driver.switchTo().defaultContent();
  driver.findElement(By.xpath("//a[contains(text(),'面试统计')]")).click();


}
@Test
//测试for循环遍历
  public void testFor() {
  //Int类型的数组，自变量名arr存了1,2,3,4,5这几个值
  int[] arr = {1, 2, 3, 4, 5};
  //for循环，int数组里面的值，起始为0，满足小于等于4，循环一次在原本基础增1
   /* for (int i=0;i<=4;i++){
      //打印输出
      System.out.println(i);
    }
    */
  //for遍历定义长度的长度中方法
  for (int i = 0; i <= arr.length - 1; i++) {
    System.out.println(i);
  }
  //通过foreach循环遍历，将int这个数组的值存到i中
  for (int i : arr) {
    //打印输出数组的值
    System.out.println(i);
  }
}
 @Test
 //共有的权限，无返回值测试九九乘法表
  public void testnine() {
    //第一个for循环遍历代表行，数字类型，i最小为1，i是一个小于等于9的数字，循环一次成功后i自增加1
    for (int i=1;i<=9;i++) {
      //第二个foe循环代表列，列在里面，这个数字起始为1，
      for (int j = 1; j <= i; j++) {
        //打印不换行print，+是符号之间的连接符
        System.out.print(j + "x" + i + "=" + i * j + "\t");
      }
      System.out.println();
    }

  }

  @Test
  public void testForr(){
    int money=300;
    if (money >= 10) {
      System.out.println("可以买笔");
    }
    if (money>=300){
      System.out.println("可以买好多吃的");
    }
  }
  @Test
     public void testIfBuy (){
    int yuE =200;
    int yuEBao =3000;
    int yinHka=20000;
    int buy=3000;
    if (yuE>=buy){
      System.out.println("余额扣除"+buy);
    }else if(yuEBao>=buy){
      System.out.println("余额宝扣除"+buy);
    }else if(yinHka>=buy){
      System.out.println("银行卡扣除"+buy);
    }else {
      System.out.println("扣款失败");
    }

    }
    @Test
    //冒泡排序BubbleSore
  public void testBubbleSore(){
    //定义一个数组，存在变量arr里
    int[] arr ={17,21,14,32,8,19};
    //foreach循环将上面arr的值存到变量i中
      for (int i:arr){
        //打印输出中数组的值，print打印出不换行，\t代表制表符，比较好看
        System.out.print(i+"\t");
      }
      //换行打印输出上面数组的值
      System.out.println();
      //for循环遍历，i的起始为数组的长度-1，i>=1，i自减
      //为什么要自减呢？因为第一轮的筛选已经将最大的值放到最后了，所以最大的值的位置就可以固定下来，不需要再参加循环
      for (int i=arr.length-1;i>=1;i--){
        //在里面在套一个for循环来定义取值下标，j起始为0，j<=i的长度-1，j作为下标循环之后自增
        for (int j=0;j<=i-1;j++){
          //在使用if做判断，arr[j]>arr[j+1]
          if (arr[j]>arr[j+1]){
            //将arr[j]的值存在a变量中
            int a=arr[j];
            //经过两个值比较将大的值放在右边
            //交换
            arr[j]=arr[j+1];
            arr[j+1]=a;
          }
          }
        }
        //foreach循环将arr的值存到i中打印出来
      for (int i:arr){
        System.out.print(i+"\t");
      }
       {

      }
      System.out.println();
      }
@Test
  public void testAssert(){
    //打开网页
    driver.get("https://www.taobao.com");
    //定位元素
    driver.findElement(By.xpath("//a[contains(text(),'亲，请登录')]")).click();
  driver.findElement(By.xpath("//a[contains(text(),'密码登录')]")).click();
  WebElement phone = driver.findElement(By.xpath("//input[@id=\"TPL_username_1\"]"));
  phone.clear();
  phone.sendKeys("15888316307");
  WebElement password = driver.findElement(By.xpath("//input[@id=\"TPL_password_1\"]"));
  password.clear();
  password.sendKeys("xuyf@1103");
  driver.findElement(By.xpath("//button[@id=\"J_SubmitStatic\"]")).click();




}
@Test
  public void testlogin(){
    driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
  WebElement username = driver.findElement(By.xpath("//input[@id=\"userName\"]"));
  username.clear();
  username.sendKeys("xuyf");
  WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
  password.clear();
  password.sendKeys("032463");
  driver.findElement(By.xpath("//input[@id=\"checkCode\"]")).sendKeys("12345");
  driver.findElement(By.xpath("//input[@id=\"loginBtn\"]")).click();
  sleep(2);
}
@Test
//公有的权限，无返回值，测试京东的断言（参数列表）{方法体}
  public void testJdAssert(){
    //driver.get获取网址
    driver.get("https://passport.jd.com");
    //定位登录这个元素并点击
    driver.findElement(By.xpath("//a[contains(text(),'登录')]")).click();
    //定位账户登录真个元素并点击
    driver.findElement(By.xpath("//a[contains(text(),'账户登录')]")).click();
    //定位用户名登录这个元素，存在loginname这个变量中给下面操作
  WebElement loginname = driver.findElement(By.xpath("//input[@id=\"loginname\"]"));
  //loginname操作是清空
  loginname.clear();
  //loginname操作是填值
  loginname.sendKeys("make果");
  //定位登录密码这个元素并存在nloginpwd这个变量中
  WebElement nloginpwd = driver.findElement(By.xpath("//input[@id=\"nloginpwd\"]"));
  //nloginpwd操作清空
  nloginpwd.clear();
  //nloginpwd操作填值
  nloginpwd.sendKeys("make1103");
  //定位到登录按钮并点击
  driver.findElement(By.xpath("//a[@id=\"loginsubmit\"]")).click();
  //休息一秒
  sleep(1);
  //登录成功之后跳转到京东主页面，看是否包含我的京东这几个字，存在actual这个变量中
  boolean actual =driver.getPageSource().contains("我的京东");
  //Assert用这个代码断言，用它里面封装好的方法，实际结果：actual，预期结果true去做判断
  Assert.assertEquals(actual,true);


}

    }



















