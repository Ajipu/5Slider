package com.example.squispe.slider;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class dialogFragmentPicasso extends DialogFragment {

    ImageView ivImageViewFromUrl;
    final String URL ="http://svm.lim.ajinomoto.com/images/fondo.jpg";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.picasso, container,false);

        ivImageViewFromUrl = (ImageView)rootView.findViewById(R.id.iv_image_from_url);
        //Picasso.with(getActivity()).load(URL).into(ivImageViewFromUrl);

        return rootView;
    }




}
