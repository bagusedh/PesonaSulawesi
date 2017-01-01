package com.bagus.app.pesonasulawesi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bagus.app.pesonasulawesi.R;
import com.bagus.app.pesonasulawesi.adapter.EventAdapter;
import com.bagus.app.pesonasulawesi.adapter.HomeAdapter;
import com.bagus.app.pesonasulawesi.dao.EventDao;

import static com.bagus.app.pesonasulawesi.R.layout.list_event;
import static com.bagus.app.pesonasulawesi.R.layout.list_home;

/**
 * Created by bagus on 26/10/16.
 */

public class DasboardFragmentEvent extends Fragment {

    private EventDao eventDao = new EventDao();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.frag_event, container, false);


        ListView listDestinationEvent = (ListView) fragmentView.findViewById(R.id.listEvent);
        listDestinationEvent.setAdapter(new EventAdapter(getContext(), list_event, eventDao.semuaDestinationEvent()));

        return fragmentView;

    }

}
