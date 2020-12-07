package com.cw.jvm.heap;

/**
 * 测试-XX:UseTLAB参数是否开启的情况:默认情况是开启的
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("-----cw-----");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
