package com.bagus.app.pesonasulawesi.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bagus.app.pesonasulawesi.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by bagus on 31/10/16.
 */

public class WakatobiMap extends Fragment implements OnMapReadyCallback {

private GoogleMap mMap;
        GoogleMap map;


@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.map_wakatobi, container, false);

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        SupportMapFragment fragment = new SupportMapFragment();
        transaction.add(R.id.fragment_navigation, fragment);

        transaction.commit();

        
        fragment.getMapAsync(this);

        return fragmentView;
        }


@Override
public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng wakatobi = new LatLng(-5.563452, 123.930425);
        mMap.addMarker(new MarkerOptions().position(wakatobi).title("Taman Nasional Wakatobi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(wakatobi));
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(wakatobi, 10);
        googleMap.animateCamera(cameraUpdate);

        }

        }

