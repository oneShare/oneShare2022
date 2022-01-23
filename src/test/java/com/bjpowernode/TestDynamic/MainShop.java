package com.bjpowernode.TestDynamic;

import com.bjpowernode.TestDynamic.factory.UsbSellFactory;
import com.bjpowernode.TestDynamic.handler.MySellHandler;
import com.bjpowernode.TestDynamic.service.UsbSell;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MainShop {

    public static void main(String[] args) {

        UsbSell factory = new UsbSellFactory();
        MySellHandler myHandler = new MySellHandler(factory);

        Proxy proxy = (Proxy)myHandler.getProxy();

    }
}
