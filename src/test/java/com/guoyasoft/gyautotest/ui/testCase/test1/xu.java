package com.guoyasoft.gyautotest.ui.testCase.test1;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.testng.annotations.Test;

/**
 * @program: xuyufei
 * @description:
 * @author: Administrator
 * @create: 2018-12-15 14:41
 **/
public class xu extends BaseUI {

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
  public void testshu() {
    String[] string = {"好", "好", "学", "习"};
    //String[] strin =new  String[5]；
    System.out.println(string[2]);
    String[] s = {"天", "天", "向", "上"};
    System.out.println(s[0]);
    /*
//二维数组取名为str1，里面有三个一维数组
    String[][] str1 ={{"1","2","3","4"},{"11","22","33"},{"111","222","333"}};
    //另外一种方法[]第一个代表一维数组里面的值得长度（以最大填），[]第二个代表二位数组的长度，里面有几个一维的数组
    //String[][] str2 =new String[4][3];
    //打印出第二个一维数组中的第一个值“11”
    System.out.println(str1[1][0]);*/
    String[][] er = {{"学", "习", "好", "棒"}, {"开", "心"}, {"我"}};
   // String[][] wei = new String[4][3];
    System.out.println(er[0][1]);
    System.out.println(er[1][0]);
    List<String> list  = new ArrayList<String>();
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
    List<String>li =new ArrayList<String>();
    li.add("我");
    li.add("们");
    li.add("开");
    li.add("心");
    li.add(2,"xin");
    System.out.println(li.get(2));
    System.out.println(li.get(1));
    Set<String> set =new HashSet<String>();
    //add:存
    set.add("111");
    set.add("222");
    set.add("333");
    //通过for循环遍历，(String s:set)：String 这个变量将上面set的值存到s中
    for (String v:set){
      //打印输出，s这个值
      System.out.println(v);
      Set<String>set1=new HashSet<String>();
      set1.add("wo");
      set1.add("hao");
      set1.add("pang");
      for (String b:set1){
        System.out.println(b);
      }
    }
  }
}
