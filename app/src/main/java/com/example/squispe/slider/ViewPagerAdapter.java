package com.example.squispe.slider;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;


public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private String[] imageUrls;

    ViewPagerAdapter(Context context, String[] imageUrls) {
        this.context = context;
        this.imageUrls = imageUrls;
    }

    @Override
    public int getCount() {
        return imageUrls.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(null);
        Picasso.get()
                .load(imageUrls[position])
                .fit().centerCrop()
                .networkPolicy(NetworkPolicy.NO_CACHE)//actualizar la imagen, no guarda en cache
                .memoryPolicy(MemoryPolicy.NO_CACHE)
                .into(imageView);
        //Picasso.get().load(url).into(view);
        //Picasso.with(context).load(imageUrls[position]).centerCrop().into(imageView);
/*
        Picasso.with(context)
                .load(imageUrls[position])
                .centerCrop()
                .fit()
                .into(imageView);
*/

        container.addView(imageView);

        return imageView;
    }
/*
    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View myImageLayout = inflater.inflate(R.layout.slide, view, false);
        ImageView myImage = (ImageView) myImageLayout
                .findViewById(R.id.image);
        myImage.setImageResource(images.get(position));
        view.addView(myImageLayout, 0);
        return myImageLayout;
    }

    */

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}