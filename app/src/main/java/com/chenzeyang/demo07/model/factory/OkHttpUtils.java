package com.chenzeyang.demo07.model.factory;

import com.chenzeyang.demo07.model.CallBack;
import com.chenzeyang.demo07.model.entity.Entity;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * ----------------Dragon be here!------------------
 * 　   　　┏┓　　　┏┓
 * 　   　┏┛┻━━━┛┻┓
 * 　   　┃　　　　　　　┃
 * 　   　┃　　　━　　　┃
 * 　   　┃　┳┛　┗┳　┃
 * 　   　┃　　　　　　　┃
 * 　   　┃　　　┻　　　┃
 * 　   　┃　　　　　　　┃
 * 　   　┗━┓　　　┏━┛
 * 　   　　　┃　　　┃神兽保佑
 * 　   　　　┃　　　┃代码无BUG！
 * 　   　　　┃　　　┗━━━┓
 * 　   　　　┃　神兽出品　　┣┓
 * 　   　　　┃　必属精品　　┏┛
 * 　   　　　┗┓┓┏━┳┓┏┛
 * 　   　　　　┃┫┫　┃┫┫
 * 　   　　　　┗┻┛　┗┻┛
 * ━━━━━━━━神兽出没━━━━━━━━
 * <p>
 * Created by Mr Chen on 2017/9/15 0015 下午 2:28.
 */

public class OkHttpUtils extends Product {
    private static OkHttpUtils okHttpUtils;
    private OkHttpClient okHttpClient;

    public OkHttpUtils() {
        okHttpClient = new OkHttpClient.Builder().build();
    }

    public static synchronized OkHttpUtils getInstance() {
        if (okHttpUtils == null)
            okHttpUtils = new OkHttpUtils();
        return okHttpUtils;
    }


    @Override
    public void sendGet(String type, final CallBack<Entity> callBack) {
        final Request request = new Request.Builder().url("http://v.juhe.cn/toutiao/index?type=" + type + "&key=097060266650f67b2cebd2a06aded587").build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callBack.failure(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                callBack.success(new Gson().fromJson(response.body().string(), Entity.class));
            }
        });
    }
}
