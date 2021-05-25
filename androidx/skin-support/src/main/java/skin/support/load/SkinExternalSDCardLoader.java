package skin.support.load;

import skin.support.SkinCompatManager;

/**
 * Copyright (C) 2017
 * 版权所有
 * <p>
 * 功能描述：外部SD卡加载，子类实现路径
 * <p>
 * 作者：yijiebuyi
 * 创建时间：2021/5/24
 * <p>
 * 修改人：
 * 修改描述：
 * 修改日期
 */

public abstract class SkinExternalSDCardLoader extends SkinSDCardLoader {
    @Override
    public int getType() {
        return SkinCompatManager.SkinLoaderStrategy.EXTERNAL_SD_CARD;
    }
}
