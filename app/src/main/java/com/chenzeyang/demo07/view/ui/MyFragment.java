package com.chenzeyang.demo07.view.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

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
 * Created by Mr Chen on 2017/9/15 0015 下午 4:07.
 */


import android.support.v4.app.Fragment;

import com.chenzeyang.demo07.model.adapter.ListViewAdapter;
import com.chenzeyang.demo07.model.entity.Entity;
import com.chenzeyang.demo07.presenter.Presenter;
import com.chenzeyang.demo07.view.MySuccess;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 壹颗大金星 on 2017/9/12.
 */

public class MyFragment extends Fragment implements MySuccess {
    private List<Entity.ResultBean.DataBean> mList = new ArrayList<>();
    private ListViewAdapter listViewAdapter;

    public static Fragment getinstance(String title) {
        //创建Fragment1
        MyFragment myFragment = new MyFragment();
        //创建bundle
        Bundle bundle = new Bundle();
        //添加值
        bundle.putString("title", title);
        //把值添加到Arguments中
        myFragment.setArguments(bundle);
        return myFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //获取Arguments
        Bundle arguments = getArguments();
        //获取值
        String title = arguments.getString("title");
        //创建textview
        LinearLayout linearLayout = new LinearLayout(getActivity());
        ListView listView = new ListView(getActivity());
        linearLayout.addView(listView);
        listViewAdapter = new ListViewAdapter(getActivity(), mList);
        listView.setAdapter(listViewAdapter);
        //设置值
        Presenter.getInstance(this).getSuccess(title);
        Log.e("TAG", "oncreateView" + title);
        return linearLayout;
    }

    @Override
    public void success(Entity entity) {
        List<Entity.ResultBean.DataBean> data = entity.getResult().getData();
        Log.e("TAG", entity.toString());
        mList.clear();
        mList.addAll(data);
        listViewAdapter.notifyDataSetChanged();
    }

    @Override
    public void failure(Exception e) {

    }
}
