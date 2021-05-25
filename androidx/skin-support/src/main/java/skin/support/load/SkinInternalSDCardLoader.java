package skin.support.load;

import android.content.Context;

import java.io.File;

import skin.support.SkinCompatManager;
import skin.support.utils.SkinFileUtils;

/**
 * Copyright (C) 2017
 * 版权所有
 * <p>
 * 功能描述：内部SD卡加载
 * <p>
 * 作者：yijiebuyi
 * 创建时间：2021/5/24
 * <p>
 * 修改人：
 * 修改描述：
 * 修改日期
 */

public class SkinInternalSDCardLoader extends SkinSDCardLoader {
    @Override
    protected String getSkinPath(Context context, String skinName) {
        return SkinFileUtils.getSkinDir(context) + File.separator + skinName;
    }

    @Override
    public int getType() {
        return SkinCompatManager.SkinLoaderStrategy.INTERNAL_SD_CARD;
    }
}
