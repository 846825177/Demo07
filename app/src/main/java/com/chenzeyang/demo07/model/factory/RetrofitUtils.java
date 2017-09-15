package com.chenzeyang.demo07.model.factory;

import com.chenzeyang.demo07.model.CallBack;
import com.chenzeyang.demo07.model.entity.Entity;
import com.google.gson.Gson;

import retrofit2.*;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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
 * Created by Mr Chen on 2017/9/15 0015 下午 2:35.
 */

public class RetrofitUtils extends Product {
    private static RetrofitUtils utils;
    private Retrofit retrofit;

    public RetrofitUtils() {
        retrofit = new Retrofit.Builder().baseUrl("http://v.juhe.cn").addConverterFactory(GsonConverterFactory.create(new Gson())).build();
    }

    public static RetrofitUtils getInstance() {
        if (utils == null) {
            synchronized (RetrofitUtils.class) {
                if (utils == null) {
                    utils = new RetrofitUtils();
                }
            }
        }
        return utils;
    }

    @Override
    public void sendGet(String type, final CallBack<Entity> callBack) {
        com.chenzeyang.demo07.model.factory.Retrofit retrofit = this.retrofit.create(com.chenzeyang.demo07.model.factory.Retrofit.class);
        Call<Entity> call = retrofit.send(type, "097060266650f67b2cebd2a06aded587");

        call.enqueue(new Callback<Entity>() {
            @Override
            public void onResponse(Call<Entity> call, Response<Entity> response) {
                callBack.success(response.body());
            }

            @Override
            public void onFailure(Call<Entity> call, Throwable t) {
                callBack.failure((Exception) t);
            }
        });
    }
}
