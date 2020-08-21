package com.xyz.service;

import android.content.Intent;
import android.util.Log;

/**
 * created by shenyonghui on 2020/8/18
 */
public class SimpleService extends BaseService {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("xx", "current thread:" + Thread.currentThread().getName());
        return super.onStartCommand(intent, flags, startId);
    }
}
