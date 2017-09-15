package com.chenzeyang.demo07.view.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chenzeyang.demo07.R;
import com.chenzeyang.demo07.model.adapter.MyAdapter;
import com.chenzeyang.demo07.model.entity.Entity;
import com.chenzeyang.demo07.presenter.Presenter;
import com.chenzeyang.demo07.view.MySuccess;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> titles = new ArrayList<>();
    private List<TextView> list;
    private HorizontalScrollView hs;
    private LinearLayout linearlayout;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //获取id
        hs = (HorizontalScrollView) findViewById(R.id.hs);
        hs.setHorizontalScrollBarEnabled(false);
        linearlayout = (LinearLayout) findViewById(R.id.linearlayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);

        //创建数组,存放标题
        titles.add("头条");
        titles.add("社会");
        titles.add("国内");
        titles.add("国际");
        titles.add("娱乐");
        titles.add("体育");
        titles.add("军事");
        titles.add("科技");
        titles.add("财经");
        titles.add("时尚");
        //创建集合,存放textview
        list = new ArrayList<TextView>();
        //创建textview
        for (int i = 0; i < titles.size(); i++) {
            //创建textview
            TextView textView = new TextView(MainActivity.this);
            textView.setText(titles.get(i));
            textView.setTextSize(20);
            textView.setId(i + 1000);
            //点击事件
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int id = view.getId();
                    viewpager.setCurrentItem(id - 1000);
                }
            });
            //刚进程序第一个默认红色,其他为黑色
            if (i == 0) {
                textView.setTextColor(Color.RED);
            } else {
                textView.setTextColor(Color.BLACK);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            layoutParams.setMargins(20, 10, 20, 10);
            //添加到布局中
            linearlayout.addView(textView, layoutParams);
            //添加到集合
            list.add(textView);
        }
        //为viewpager设置适配器
        List<String> type = new ArrayList<>();
        type.add("top");
        type.add("sheihui");
        type.add("guonei");
        type.add("guoji");
        type.add("yule");
        type.add("tiyu");
        type.add("junshi");
        type.add("keji");
        type.add("caijing");
        type.add("shishang");
        viewpager.setAdapter(new MyAdapter(getSupportFragmentManager(), type));
        //viewpager的监听
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            //滑动改变颜色
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //list中存的是 textview
                for (int i = 0; i < list.size(); i++) {
                    if (position == i) {
                        list.get(i).setTextColor(Color.RED);
                    } else {
                        list.get(i).setTextColor(Color.BLACK);
                    }
                }
                //获取当前的textview
                TextView textView = list.get(position);
                //width是每次滑动的距离
                int width = textView.getWidth() + 10;
                //让scrollView滑动   滑动距离是textview之间的间距
                hs.scrollTo(width * position, 0);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
