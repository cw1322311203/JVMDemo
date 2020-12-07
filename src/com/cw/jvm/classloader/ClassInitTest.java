package com.cw.jvm.classloader;

/**
 * 类的初始化 clinit
 */
public class ClassInitTest {

    private static int num = 1;

    /**
     * 若将static代码块放到number后,则main方法中打印的number值则为20
     * 因为构造器方法中指令按语句在源文件中出现的顺序执行。
     */
    static {
        num = 2;
        number = 20;//可以赋值
        System.out.println(num);
        // 声明的变量在后面,可以赋值,但不能调用
        //System.out.println(number);//报错 ：非法的前向引用，不能调用
    }

    /**
     * linking之中prepare阶段先为类变量(static修饰的变量)分配内存并设置初始值(零值):number = 0
     * -->  initialization初始化阶段: 先赋值为20  --> 再赋值为10
     */
    private static int number = 10;


    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);//2
        System.out.println(ClassInitTest.number);//20
    }
}
