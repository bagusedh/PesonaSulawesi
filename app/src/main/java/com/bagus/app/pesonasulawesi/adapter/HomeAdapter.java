package com.bagus.app.pesonasulawesi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bagus.app.pesonasulawesi.R;
import com.bagus.app.pesonasulawesi.model.Home;

import java.util.List;

/**
 * Created by bagus on 26/12/16.
 */

public class HomeAdapter extends ArrayAdapter<Home> {
    public HomeAdapter(Context context, int resource, List<Home> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_home, parent, false);
        }


        TextView txtNamaDestinationHome = (TextView) convertView.findViewById(R.id.lblNamaDestinationHome);
        TextView txtKotaDestinationHome = (TextView) convertView.findViewById(R.id.lblKotaDestinationHome);
        TextView txtKeteranganDestinationHome = (TextView) convertView.findViewById(R.id.lblKeteranganHome);


        Home h = getItem(position);
        txtNamaDestinationHome.setText(h.getNamaDestinationHome());
        txtKotaDestinationHome.setText(h.getKotaDestinationHome());
        txtKeteranganDestinationHome.setText(h.getKeteranganDestinationHome());
        return convertView;

    }



}



