package com.chenzeyang.demo07.presenter;

import android.os.Handler;
import android.os.Message;

import com.chenzeyang.demo07.model.CallBack;
import com.chenzeyang.demo07.model.MyModel;
import com.chenzeyang.demo07.model.entity.Entity;
import com.chenzeyang.demo07.model.factory.MyFactory;
import com.chenzeyang.demo07.view.MySuccess;

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
 * Created by Mr Chen on 2017/9/15 0015 下午 2:46.
 */

public class Presenter {
    private MySuccess success;
    private MyModel model;
    private static Presenter presenter;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 1:
                    success.success((Entity) msg.obj);
                    break;
                case 2:
                    success.failure((Exception) msg.obj);
                    break;
            }
        }
    };

    private Presenter(MySuccess success) {
        this.success = success;
        model = new MyModel();
    }

    public static final Presenter getInstance(MySuccess success) {
        if (presenter == null) {
            synchronized (Presenter.class) {
                if (presenter == null) {
                    presenter = new Presenter(success);
                }
            }
        }
        return presenter;
    }

    public void getSuccess(String type) {
        model.send(type, new CallBack<Entity>() {
            @Override
            public void success(Entity entity) {
                Message message = new Message();
                message.obj = entity;
                message.what = 1;
                handler.sendMessage(message);
            }

            @Override
            public void failure(Exception e) {
                Message message = new Message();
                message.obj = e;
                message.what = 2;
                handler.sendMessage(message);
            }
        });
    }
}
