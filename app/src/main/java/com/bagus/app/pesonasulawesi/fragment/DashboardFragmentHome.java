package com.bagus.app.pesonasulawesi.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.bagus.app.pesonasulawesi.R;
import com.bagus.app.pesonasulawesi.adapter.HomeAdapter;
import com.bagus.app.pesonasulawesi.dao.EventDao;
import com.bagus.app.pesonasulawesi.dao.HomeDao;
import com.bagus.app.pesonasulawesi.model.Home;

import java.util.List;

import static com.bagus.app.pesonasulawesi.R.layout.list_event;
import static com.bagus.app.pesonasulawesi.R.layout.list_home;

/**
 * Created by bagus on 26/10/16.
 */

public class DashboardFragmentHome  extends Fragment{

    private HomeDao homeDao = new HomeDao();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.frag_home, container, false);

        ListView listDestinationHome = (ListView) fragmentView.findViewById(R.id.listHome);
        listDestinationHome.setAdapter(new HomeAdapter(getContext(), list_home, homeDao.semuaDestinationHome()));

        return fragmentView;

    }

}
