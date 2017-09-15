package com.chenzeyang.demo07.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chenzeyang.demo07.R;
import com.chenzeyang.demo07.model.entity.Entity;

import java.util.List;

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
 * Created by Mr Chen on 2017/9/15 0015 下午 4:29.
 */

public class ListViewAdapter extends BaseAdapter {

    private Context context;
    private List<Entity.ResultBean.DataBean> mList;

    public ListViewAdapter(Context context, List<Entity.ResultBean.DataBean> mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_item, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.date.setText(mList.get(position).getDate());
        holder.author_name.setText(mList.get(position).getAuthor_name());
        holder.title.setText(mList.get(position).getTitle());
        Glide.with(context).load(mList.get(position).getThumbnail_pic_s()).into(holder.thumbnail_pic_s);
        return convertView;
    }

    public static class ViewHolder {
        public View rootView;
        public TextView title;
        public ImageView thumbnail_pic_s;
        public TextView date;
        public TextView author_name;

        public ViewHolder(View rootView) {
            this.rootView = rootView;
            this.title = (TextView) rootView.findViewById(R.id.title);
            this.thumbnail_pic_s = (ImageView) rootView.findViewById(R.id.thumbnail_pic_s);
            this.date = (TextView) rootView.findViewById(R.id.date);
            this.author_name = (TextView) rootView.findViewById(R.id.author_name);
        }

    }
}
