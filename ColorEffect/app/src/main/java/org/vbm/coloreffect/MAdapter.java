package org.vbm.coloreffect;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vbm on 02/03/2017.
 */

public class MAdapter extends BaseAdapter {
    String[] colors;

    public MAdapter(String[] colors) {
        this.colors=colors;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int i) {
        return colors[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if( view == null){
            LayoutInflater li = LayoutInflater.from(viewGroup.getContext());
            view = li.inflate(R.layout.spinitem,null);
        }
        TextView tv = (TextView) view.findViewById(R.id.itemTextView);
        String text = (String)getItem(i);
        tv.setText(text);
        //tv.setTextColor(ContextCompat.getColor(viewGroup.getContext(),Description.getColor(text)));
        ImageView imv = (ImageView) view.findViewById(R.id.circle);
        Drawable circle = imv.getDrawable();
        ((GradientDrawable)circle).setColor(ContextCompat.getColor(viewGroup.getContext(),Description.getColor(text)));
        return view;
    }


}
