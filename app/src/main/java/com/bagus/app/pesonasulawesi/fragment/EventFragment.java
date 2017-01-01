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
import com.bagus.app.pesonasulawesi.dao.EventDao;

import static com.bagus.app.pesonasulawesi.R.id.listView;

/**
 * Created by bagus on 14/10/16.
 */

public class EventFragment extends Fragment {

    private EventDao eventDao = new EventDao();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.frag_event, container, false);

        ListView listDestinationEvent = (ListView) fragmentView.findViewById(listView);
        listDestinationEvent.setAdapter(new EventAdapter(getContext(), R.layout.list_event, EventDao.semuaDestinationEvent()));

        return fragmentView;

    }
}
