package com.example.administrator.yuanxingtu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/8/22.
 */

public class Fragment1 extends Fragment {

    private ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1,container,false);
        imageView = (ImageView) view.findViewById(R.id.image_yuan);
        GlideUtils.LoadCircleImage(getActivity(),R.drawable.timg, imageView);
        return view;
    }
}
