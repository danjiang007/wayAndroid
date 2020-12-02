package com.jiang.net;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;

public class ImageLoaderManager {
    public  void with(Context context, String url, ImageView imageView){
        RequestManager requestManager = Glide.with(context);
        RequestBuilder<Drawable> requestBuilder = requestManager.load(url);
        requestBuilder.into(imageView);
//                .into(imageView);
    }
}
