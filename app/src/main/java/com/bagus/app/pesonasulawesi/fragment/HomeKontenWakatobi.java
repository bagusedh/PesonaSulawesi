package com.bagus.app.pesonasulawesi.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

import com.bagus.app.pesonasulawesi.R;

/**
 * Created by bagus on 29/12/16.
 */

public class HomeKontenWakatobi extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.frag_home_wakatobi, container,false);

        Button buttonMapWakatobi = (Button) fragmentView.findViewById(R.id.buttonMapWakatobi);
        buttonMapWakatobi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                FragmentTransaction ft = HomeKontenWakatobi.this.getActivity().getSupportFragmentManager()
                        .beginTransaction();

                ft.replace(R.id.fragment_navigation, new WakatobiMap());
                ft.commit();

            }
        });



        String url = "http://pesona.indonesia.travel/destinasi/sulawesi/sulawesi-tenggara/taman-nasional-wakatobi/";
        WebView view = (WebView) fragmentView.findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);

        return fragmentView;


    }
}


