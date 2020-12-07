package com.cw.jvm.heap;


/**
 * -Xms600m -Xmx600m
 *
 * -XX:NewRatio : 设置新生代与老年代的比例,默认值是2,表示比例为1:2
 * -XX:SurvivorRatio=8 : 设置新生代中Eden区与Survivor区的比例
 * -XX:-UseAdaptiveSizePolicy:关闭自适应的内存分配策略(暂时用不到)
 * -Xmn:设置新生代最大内存大小
 */
public class EdenSurvivorTest {
    public static void main(String[] args) {
        System.out.println("酱油党");
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}