package com.cw.jvm.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试MinorGC,MajorGC,FullGC
 * <p>
 * -Xms9m -Xmx9m -XX:+PrintGCDetails
 */
public class GCTest {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "cw.com";
            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("遍历次数为: " + i);
        }
    }
}
