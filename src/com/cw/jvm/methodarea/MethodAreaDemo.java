package com.cw.jvm.methodarea;


/**
 * 测试设置方法区大小参数的默认值
 * -Xms600m -Xmx600m
 * <p>
 * jdk7及以前
 * -XX:PermSize=100m -XX:MaxPermSize=100m
 * <p>
 * jdk8及以后
 * -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start....");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end.....");
    }
}
