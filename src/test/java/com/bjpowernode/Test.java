package com.bjpowernode;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ResourceBundle rb = ResourceBundle.getBundle("test");
        StringBuilder sb = new StringBuilder();
        Class c = Class.forName(rb.getString("className"));
        Object testJava = null;
        try {
            testJava = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Method method1 = c.getDeclaredMethod("doTest",String.class);
        Method method2 = c.getDeclaredMethod("doTest");
        Method method3 = c.getDeclaredMethod("doTest",String.class,int.class);
        method1.invoke(testJava,"s");
    }
}
