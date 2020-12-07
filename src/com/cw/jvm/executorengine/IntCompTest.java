package com.cw.jvm.executorengine;

/**
 * 测试解释器模式和JIT编译模式
 * -Xint:完全采用解释器模式执行程序，花费的时间为：6293ms
 * -Xcomp:完全采用即时编译器模式执行程序。如果即时编译出现问题，解释器会介入执行 ,花费的时间为：694ms
 * -Xmixed:采用解释器+即时编译器的混合模式共同执行程序,花费的时间为：844ms
 */
public class IntCompTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        testPrimeNumber(1000000);

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));

    }

    public static void testPrimeNumber(int count) {
        for (int i = 0; i < count; i++) {
            // 计算100以内的质数
            label:
            for (int j = 2; j <= 100; j++) {
                for (int k = 2; k <= Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        continue label;
                    }
                }
            }
        }
    }
}
