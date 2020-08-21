package com.xyz.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

/**
 * created by shenyonghui on 2020/8/18
 */
public class SimpleIntentService extends IntentService {

    public SimpleIntentService() {
        super("name");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.e("xx", "current thread:" + Thread.currentThread().getName());
    }
}
