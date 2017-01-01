package com.bagus.app.pesonasulawesi.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.bagus.app.pesonasulawesi.R;

/**
 * Created by bagus on 30/12/16.
 */

public class HomeKontenBunaken extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.frag_home_wakatobi, container, false);

        String url = "http://pesona.indonesia.travel/destinasi/sulawesi/sulawesi-utara/taman-nasional-bunaken/";
        WebView view = (WebView) rootView.findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);

        return rootView ;
    }
}
