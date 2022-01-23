package com.bjpowernode.TestDynamic.factory;

import com.bjpowernode.TestDynamic.service.UsbSell;

public class UsbSellFactory implements UsbSell {

    @Override
    public float sell(int amount) {
        return 85.0f;
    }

}
