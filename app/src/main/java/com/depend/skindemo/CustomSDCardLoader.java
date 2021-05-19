package com.depend.skindemo;

import android.content.Context;
import android.os.Environment;

import java.io.File;

import skin.support.load.SkinSDCardLoader;
import skin.support.utils.SkinFileUtils;

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

class CustomSDCardLoader extends SkinSDCardLoader {
    public static final int SKIN_LOADER_STRATEGY_SDCARD = Integer.MAX_VALUE;

    @Override
    protected String getSkinPath(Context context, String skinName) {
        //String dir = Environment.getExternalStorageDirectory().getAbsolutePath()  + "/skins";
        String dir = SkinFileUtils.getSkinDir(context);
        return new File(dir, skinName).getAbsolutePath();
    }

    @Override
    public int getType() {
        return SKIN_LOADER_STRATEGY_SDCARD;
    }
}