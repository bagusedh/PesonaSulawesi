package com.bagus.app.pesonasulawesi.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.bagus.app.pesonasulawesi.R;
import com.bagus.app.pesonasulawesi.adapter.HomeAdapter;
import com.bagus.app.pesonasulawesi.dao.HomeDao;

import static com.bagus.app.pesonasulawesi.R.id.listView;


/**
 * Created by bagus on 15/10/16.
 */

public class HomeFragment extends Fragment {

    private HomeDao homeDao = new HomeDao();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.frag_home, container, false);


        ListView listDestinationHome = (ListView)fragmentView.findViewById(listView);


        listDestinationHome.setOnItemClickListener(onItemClickListener);


        listDestinationHome.setAdapter(new HomeAdapter(getContext(), R.layout.list_destination, homeDao.semuaDestinationHome()));


        return fragmentView;

    }


    private AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                long arg3) {
            // TODO Auto-generated method stub
            //do your job here, position is the item position in ListView

            if (position == 0) {
                HomeKontenWakatobi fragment1 = new HomeKontenWakatobi();
                FragmentManager fragmentManager1 = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                fragmentTransaction1.replace(R.id.fragment_navigation, fragment1);
                fragmentTransaction1.addToBackStack(null);
                fragmentTransaction1.commit();
            }

            if (position == 1) {
                HomeKontenBunaken fragment2 = new HomeKontenBunaken();
                FragmentManager fragmentManager1 = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                fragmentTransaction1.replace(R.id.fragment_navigation, fragment2);
                fragmentTransaction1.addToBackStack(null);
                fragmentTransaction1.commit();
            }
        }
    };

}

