package com.cw.jvm.runtimedata;

import java.util.Date;

/**
 * 局部变量表
 */
public class LocalVariablesTest {

    private int count = 0;

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    public static void testStatic() {
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int count = 10;
        System.out.println(count);
        //编译错误，因为this变量不存在与当前方法的局部变量表中！！！
        //System.out.println(this.count);
    }

    // 关于slot的使用的理解
    public LocalVariablesTest() {
        this.count = 1;
    }

    public void test1() {
        Date date = new Date();
        String name1 = "cw";
        String info = test2(date, name1);
        System.out.println(date + name1);
    }

    public String test2(Date dateP, String name2) {
        dateP = null;
        name2 = "wc";
        double weight = 130.5;// 占据两个slot
        char gender = '男';
        return dateP + name2;
    }

    public void test3() {
        this.count++;
    }

    public void test4() {
        int a = 0;
        // 变量b出了{}以后就挂掉了,作用域没有了销毁了,但是数组的位置已经开辟了
        {
            int b = 0;
            b = a + 1;
        }
        //变量c使用之前以及经销毁的变量b占据的slot位置
        int c = a + 1;
    }

}
