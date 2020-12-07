package com.cw.jvm.classloader;

public class ClinitTest {

    //任何一个类声明以后，内部至少存在一个类的构造器---对应字节码文件中的init方法
    private int a = 1;

    //private static int c=3;
    static {
        int c = 10;
    }

    public ClinitTest() {
        a = 10;
        int d = 20;
    }

    // 自定义多个构造器则字节码中对应多个init方法
    public ClinitTest(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        int b = 2;
    }
}
