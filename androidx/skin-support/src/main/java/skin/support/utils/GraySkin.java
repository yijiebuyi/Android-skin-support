package skin.support.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import skin.support.view.GrayFrameLayout;

/**
 * Copyright (C) 2017
 * 版权所有
 * <p>
 * 功能描述：
 * <p>
 * 作者：yijiebuyi
 * 创建时间：2021/5/26
 * <p>
 * 修改人：
 * 修改描述：
 * 修改日期
 */

public class GraySkin {
    /**
     * 创建灰色主题布局
     * @param context
     * @param attrs
     * @return
     */
    public static View createGrayLayout(Context context, AttributeSet attrs) {
        try {
            int count = attrs.getAttributeCount();
            for (int i = 0; i < count; i++) {
                String attributeName = attrs.getAttributeName(i);
                String attributeValue = attrs.getAttributeValue(i);
                if (attributeName.equals("id")) {
                    int id = Integer.parseInt(attributeValue.substring(1));
                    String idVal = context.getResources().getResourceName(id);
                    if ("android:id/content".equals(idVal)) {
                        GrayFrameLayout grayFrameLayout = new GrayFrameLayout(context, attrs);
                        return grayFrameLayout;
                    }
                }
            }
        } catch (Exception e) {

        }

        return null;
    }
}
