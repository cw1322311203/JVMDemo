package com.cw.jvm.classloader;

import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;

/**
 * 虚拟机自带加载器
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("********启动类加载器*********");
        //获取BootStrapClassLoader能够加载的api路径
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL e : urls) {
            System.out.println(e.toExternalForm());
        }

        //从上面的路径中随意选择一个类 看看他的类加载器是什么
        //Provider位于 /jdk1.8.0_161/jre/lib/jsse.jar下，引导类加载器加载它
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader);//null

        System.out.println("********扩展类加载器********");
        //String extDirs = System.getProperty("java.ext.dirs");
//        for (String path : extDirs.split(";")) {
//            System.out.println(path);
//        }
        //从上面的路径中随意选择一个类 看看他的类加载器是什么:扩展类加载器
        //CurveDB位于 /jdk1.8.0_161/jre/lib/ext/sunec.jar下，扩展类加载器
        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
        System.out.println(classLoader1);//sun.misc.Launcher$ExtClassLoader@29453f44
        
    }
}

