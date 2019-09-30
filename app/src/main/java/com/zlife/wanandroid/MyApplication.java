package com.zlife.wanandroid;

import android.app.Application;
import android.content.Context;

/**
 * @author zhangxiao
 * Date on 2019-09-30.
 */
public class MyApplication extends Application {

    private Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = this;
    }
}
