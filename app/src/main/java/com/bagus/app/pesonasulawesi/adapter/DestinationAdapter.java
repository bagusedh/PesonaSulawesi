package com.bagus.app.pesonasulawesi.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bagus.app.pesonasulawesi.R;
import com.bagus.app.pesonasulawesi.fragment.DashdoardFragment;
import com.bagus.app.pesonasulawesi.model.Destination;

import java.util.List;

/**
 * Created by bagus on 27/10/16.
 */

public class DestinationAdapter extends ArrayAdapter<Destination> {
    public DestinationAdapter(Context context, int resource, List<Destination> objects) {
        super(context, resource, objects);
    }




    @NonNull
    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_destination, parent, false);
        }

            TextView txtNamaDestination = (TextView) convertView.findViewById(R.id.lblNamaDestination);
            TextView txtKotaDestination = (TextView) convertView.findViewById(R.id.lblKotaDestination);
            TextView txtKeteranganDestination = (TextView) convertView.findViewById(R.id.lblKeterangan);


            Destination d = getItem(position);
            txtNamaDestination.setText(d.getNamaDestination());
            txtKotaDestination.setText(d.getKotaDestination());
            txtKeteranganDestination.setText(d.getKeteranganDestination());

            return convertView;

    }
}
