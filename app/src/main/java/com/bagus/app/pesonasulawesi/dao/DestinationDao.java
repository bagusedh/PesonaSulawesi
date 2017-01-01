package com.bagus.app.pesonasulawesi.dao;

import com.bagus.app.pesonasulawesi.model.Destination;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bagus on 27/10/16.
 */

public class DestinationDao {

    public List<Destination> semuaDestination(){
        List<Destination> dataDestination = new ArrayList<>();

        Destination d1 = new Destination();
        d1.setNamaDestination("Wakatobi National Park");
        d1.setKotaDestination("Sulawesi Tenggara");
        d1.setKeteranganDestination("Wakatobi National Park is a marine national park in Southeast Sulawesi, Indonesia.");
        dataDestination.add(d1);


        Destination d2 = new Destination();
        d2.setNamaDestination("Bunaken National Park");
        d2.setKotaDestination("Sulawesi Utara");
        d2.setKeteranganDestination("The Bunaken National Park is a marine park in the north of Sulawesi island, Indonesia.");
        dataDestination.add(d2);


        Destination d3 = new Destination();
        d3.setNamaDestination("Lore Lindu National Park");
        d3.setKotaDestination("Sulawesi Tengah");
        d3.setKeteranganDestination("Lush national park with jungle, lakes, waterfalls & rich flora & fauna, popular with hikers.");
        dataDestination.add(d3);

        Destination d4 = new Destination();
        d4.setNamaDestination("Taka Bone Rate National Park");
        d4.setKotaDestination("Sulawesi Selatan");
        d4.setKeteranganDestination("Taka Bone Rate National Park is a marine park which includes the Takabonerate atoll islands, located in the Flores Sea.");
        dataDestination.add(d4);


        Destination d5 = new Destination();
        d5.setNamaDestination("Bantimurung – Bulusaraung National Park");
        d5.setKotaDestination("Sulawesi Selatan");
        d5.setKeteranganDestination("Bantimurung Bulusaraung National Park is a national park in South Sulawesi in Indonesia.");
        dataDestination.add(d5);


        Destination d6 = new Destination();
        d6.setNamaDestination("Lake Tempe");
        d6.setKotaDestination("Sulawesi Selatan");
        d6.setKeteranganDestination("Lake Tempe is a lake in South Sulawesi, Indonesia.");
        dataDestination.add(d6);

        Destination d7 = new Destination();
        d7.setNamaDestination("Bogani Nani Wartabone National Park");
        d7.setKotaDestination("Sulawesi Utara");
        d7.setKeteranganDestination("Bogani Nani Wartabone National Park is a 2,871 km² National Park on Minahassa Peninsula on Sulawesi island.");
        dataDestination.add(d7);

        Destination d8 = new Destination();
        d8.setNamaDestination("Kepulauan Togean National Park");
        d8.setKotaDestination("Sulawesi Tenggara");
        d8.setKeteranganDestination("Kepulauan Togean National Park is a largely marine national park, including the Togian Islands.");
        dataDestination.add(d8);


        Destination d9 = new Destination();
        d9.setNamaDestination("Lake Poso");
        d9.setKotaDestination("Sulawesi Tenggara");
        d9.setKeteranganDestination("Lake Poso is a lake in Central Sulawesi, Indonesia, and the third-deepest lake in Indonesia.");
        dataDestination.add(d9);


        Destination d10 = new Destination();
        d10.setNamaDestination("Palopo");
        d10.setKotaDestination("Sulawesi Selatan");
        d10.setKeteranganDestination("Palopo or Kota Palopo is one of the autonomous cities in South Sulawesi Province of Indonesia.");
        dataDestination.add(d10);

        return dataDestination;
    }

}
