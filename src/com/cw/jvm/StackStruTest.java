package com.cw.jvm;

public class StackStruTest {
    public static void main(String[] args) {
        //int i = 2 + 3;
        int i = 2;
        int j = 3;
        int k = i + j;

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello");
    }


    public int calc() {
        int a = 100;
        int b = 200;
        int c = 300;
        return (a + b) * c;
    }
}
