package com.depend.skindemo;

import android.app.Application;

import skin.support.SkinCompatManager;
import skin.support.app.SkinAppCompatViewInflater;
import skin.support.load.SkinInternalSDCardLoader;

/**
 * Copyright (C) 2017
 * 版权所有
 * <p>
 * 功能描述：
 * <p>
 * 作者：yijiebuyi
 * 创建时间：2021/5/18
 * <p>
 * 修改人：
 * 修改描述：
 * 修改日期
 */

public class SkinApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        SkinCompatManager.withoutActivity(this)
                .addInflater(new SkinAppCompatViewInflater())           // 基础控件换肤初始化
                .setSkinWindowBackgroundEnable(false)                   // 关闭windowBackground换肤，默认打开[可选]
                .addStrategy(new SkinInternalSDCardLoader())
                .loadSkin("night.skin", null);
    }
}
