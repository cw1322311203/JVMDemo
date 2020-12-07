package com.cw.string2;

import org.junit.Test;

import javax.annotation.processing.SupportedSourceVersion;
import java.sql.SQLOutput;

/**
 *
 */
public class StringTest4 {
    public static void main(String[] args) {
        System.out.println();// 3105个字符串
        System.out.println("1");// 3106个字符串
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");// 3115个字符串
        //如下的字符串"1" 到 "10"不会再次加载
        System.out.println("1");// 3116：在此之前一共有3116个字符串
        System.out.println("2");// 3116
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");// 3116
    }
}

