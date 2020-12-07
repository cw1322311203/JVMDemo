package com.cw.java;

import java.util.ArrayList;

/**
 * -Xms8m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError
 *
 * -XX:+HeapDumpOnOutOfMemoryError：当出现OOM时，会在当前module目录下生成堆空间的dump文件
 *
 * @author 陈小哥cw
 * @date 2020/6/24 8:19
 */
public class HeapOOM {
    byte[] buffer = new byte[1 * 1024 * 1024];//1MB

    public static void main(String[] args) {
        ArrayList<HeapOOM> list = new ArrayList<>();

        int count = 0;
        try {
            while (true) {
                list.add(new HeapOOM());
                count++;
            }
        } catch (Throwable e) {
            System.out.println("count = " + count);
            e.printStackTrace();
        }
    }
}
