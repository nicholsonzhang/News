package com.nichol.news.imageloader;

import android.content.Context;
import android.widget.ImageView;

public class ImageLoader {

    private ImageLoader() {

    }

    public static ImageLoader get() {
        return ImageLoaderHolder.sInstance;
    }

    private static class ImageLoaderHolder {
        private static ImageLoader sInstance = new ImageLoader();
    }

    public void load(Context context, String url, ImageView imageView) {
        GlideApp.with(context).load(url).into(imageView);
    }

    public void loadCircle(Context context, String url, ImageView imageView) {
        GlideApp.with(context).load(url).transform(new GlideCircleTransform()).into(imageView);
    }

    public void loadRound(Context context, String url, ImageView imageView) {
        GlideApp.with(context).load(url).transform(new GlideRoundTransform(context)).into(imageView);
    }
}
