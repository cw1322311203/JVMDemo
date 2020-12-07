package com.cw.jvm.heap;

/**
 * 测试:大对象直接进入老年代
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 * Eden:16m  s0:2m s1:2m Old:40m
 * 对象为20m大于eden区大小,直接进入老年代
 */
public class YoungOldAreaTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024 * 1024 * 20];//20m
    }
}
