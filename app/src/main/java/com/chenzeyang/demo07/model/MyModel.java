package com.chenzeyang.demo07.model;

import com.chenzeyang.demo07.model.entity.Entity;
import com.chenzeyang.demo07.model.factory.Factory;
import com.chenzeyang.demo07.model.factory.MyFactory;
import com.chenzeyang.demo07.model.factory.OkHttpUtils;
import com.chenzeyang.demo07.model.factory.Product;

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
 * Created by Mr Chen on 2017/9/15 0015 下午 2:27.
 */

public class MyModel implements Model {
    @Override
    public void send(String type, CallBack<Entity> callBack) {
        MyFactory factory = new MyFactory();
        OkHttpUtils okHttpUtils = factory.ConcreateHttp(OkHttpUtils.class);
        okHttpUtils.sendGet(type, callBack);
    }
}
