package com.bagus.app.pesonasulawesi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.bagus.app.pesonasulawesi.R;
import com.bagus.app.pesonasulawesi.model.Event;

import java.util.List;

/**
 * Created by bagus on 26/12/16.
 */

public class EventAdapter extends ArrayAdapter<Event> {
    public EventAdapter(Context context, int resource, List<Event> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_event, parent, false);
        }

        TextView txtNamaDestinationEvent = (TextView) convertView.findViewById(R.id.lblNamaDestinationEvent);
        TextView txtKotaDestinationEvent = (TextView) convertView.findViewById(R.id.lblKotaDestinationEvent);
        TextView txtKeteranganDestinationEvent = (TextView) convertView.findViewById(R.id.lblKeteranganEvent);


        Event d = getItem(position);
        txtNamaDestinationEvent.setText(d.getNamaDestinationEvent());
        txtKotaDestinationEvent.setText(d.getKotaDestinationEvent());
        txtKeteranganDestinationEvent.setText(d.getKeteranganDestinationEvent());

        return convertView;

    }
}
