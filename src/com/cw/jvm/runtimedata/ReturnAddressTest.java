package com.cw.jvm.runtimedata;


import java.io.IOException;

public class ReturnAddressTest {

    public void method2() {
        try {
            method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method1() throws IOException {

    }
}
