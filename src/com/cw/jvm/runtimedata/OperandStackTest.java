package com.cw.jvm.runtimedata;

public class OperandStackTest {
    public void testAddOperation() {
        // byte,short,char,boolean:都以int型来保存
        // 实例方法中,该对象引用this将会存放在index为0的slot处
        byte i = 15;
        int j = 8;
        int k = i + j;
    }

    public int getSum() {
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum() {
        // 获取上一个栈帧返回的结果,并保存在操作数栈中
        // 在非静态方法中，aload_0 表示对this的操作，
        // 在static 方法中，aload_0表示对方法的第一参数的操作
        int i = getSum();
        int j = 10;
    }

    public void add() {
        // 第一类问题
        int i1 = 10;
        i1++;//11

        int i2 = 10;
        ++i2;//11

        // 第二类问题
        int i3 = 10;
        int i4 = i3++;//10

        int i5 = 10;
        int i6 = ++i5;//11

        // 第三类问题
        int i7 = 10;
        i7 = i7++;//11

        int i8 = 10;
        i8 = ++i8;//10

        // 第四类问题
        int i9 = 10;
        int i10 = i9++ + ++i9;//22
    }
}
