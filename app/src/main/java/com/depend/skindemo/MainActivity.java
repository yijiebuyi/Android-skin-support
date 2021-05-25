package com.depend.skindemo;

import android.os.Bundle;

import com.common.aac.BaseVCActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.lib.ut.util.ToastUtils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.SkinAppCompatDelegateImpl;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import skin.support.SkinCompatManager;
import skin.support.annotation.Skinable;
import skin.support.app.SkinAppCompatViewInflater;
import skin.support.content.res.SkinCompatUserThemeManager;

@Skinable
public class MainActivity extends BaseVCActivity {
    boolean boolValue = true;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    /**
     * 初始化 页面title bar 的标题
     *
     * @return
     */
    @Override
    public String initTitle() {
        return null;
    }

    /**
     * 创建页面 view
     *
     * @return
     */
    @Override
    public View createContentView() {
        return inflate(R.layout.activity_main);
    }

    /**
     * 初始化数据
     *
     * @param content
     */
    @Override
    public void initData(View content) {
        content.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (boolValue) {
                    boolValue = false;
                    SkinCompatManager.getInstance()
                            .loadSkin("night.skin", null, SkinCompatManager.SkinLoaderStrategy.INTERNAL_SD_CARD);
                } else {
                    boolValue = true;
                    SkinCompatManager.getInstance().restoreDefaultTheme();
                }
            }
        });
    }

    @NonNull
    @Override
    public AppCompatDelegate getDelegate() {
        return SkinAppCompatDelegateImpl.get(this, this);
    }

}