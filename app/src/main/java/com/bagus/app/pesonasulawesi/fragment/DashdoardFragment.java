package com.bagus.app.pesonasulawesi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bagus.app.pesonasulawesi.R;
import com.bagus.app.pesonasulawesi.adapter.DestinationAdapter;
import com.bagus.app.pesonasulawesi.dao.DestinationDao;

import static com.bagus.app.pesonasulawesi.R.layout.list_destination;


/**
 * Created by bagus on 28/10/16.
 */

public class DashdoardFragment extends Fragment {

    private DestinationDao destinationDao = new DestinationDao();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.frag_destination, container, false);


        ListView listDestination = (ListView) fragmentView.findViewById(R.id.listDestination);
        listDestination.setAdapter(new DestinationAdapter(getContext(), list_destination, destinationDao.semuaDestination()));

        return fragmentView;

    }


}

