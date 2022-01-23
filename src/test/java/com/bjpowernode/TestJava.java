package com.bjpowernode;

public class TestJava {

    public static void doTest(){
        System.out.println("无参数的doTest方法执行了");
    }

    public void doTest(String s){
        System.out.println("String参数的doTest方法执行了");
    }

    public static String doTest(String s,int i){
        System.out.println("String和int参数的doTest方法执行了");
        return "wys";
    }

    public static int doSome(){
        return 1;
    }

}
