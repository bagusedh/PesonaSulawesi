package com.bagus.app.pesonasulawesi.dao;

import com.bagus.app.pesonasulawesi.model.Home;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bagus on 26/12/16.
 */

public class HomeDao {

    public static List<Home> semuaDestinationHome(){
        List<Home> dataDestinationHome = new ArrayList<>();

        Home h1 = new Home();
        h1.setNamaDestinationHome("Wakatobi National Park");
        h1.setKotaDestinationHome("Sulawesi Tenggara");
        h1.setKeteranganDestinationHome("Wakatobi National Park is a marine national park in Southeast Sulawesi, Indonesia.");
        dataDestinationHome.add(h1);

        Home h2 = new Home();
        h2.setNamaDestinationHome("Bunaken National Park");
        h2.setKotaDestinationHome("Sulawesi Utara");
        h2.setKeteranganDestinationHome("The Bunaken National Park is a marine park in the north of Sulawesi island, Indonesia.");
        dataDestinationHome.add(h2);

        Home h3 = new Home();
        h3.setNamaDestinationHome("Lore Lindu National Park");
        h3.setKotaDestinationHome("Sulawesi Tengah");
        h3.setKeteranganDestinationHome("Lush national park with jungle, lakes, waterfalls & rich flora & fauna, popular with hikers.");
        dataDestinationHome.add(h3);

        Home h4 = new Home();
        h4.setNamaDestinationHome("Taka Bone Rate National Park");
        h4.setKotaDestinationHome("Sulawesi Selatan");
        h4.setKeteranganDestinationHome("Taka Bone Rate National Park is a marine park which includes the Takabonerate atoll islands, located in the Flores Sea.");
        dataDestinationHome.add(h4);

        Home h5 = new Home();
        h5.setNamaDestinationHome("Bantimurung – Bulusaraung National Park");
        h5.setKotaDestinationHome("Sulawesi Selatan");
        h5.setKeteranganDestinationHome("Bantimurung Bulusaraung National Park is a national park in South Sulawesi in Indonesia.");
        dataDestinationHome.add(h5);

        Home h6 = new Home();
        h6.setNamaDestinationHome("Lake Tempe");
        h6.setKotaDestinationHome("Sulawesi Selatan");
        h6.setKeteranganDestinationHome("Lake Tempe is a lake in South Sulawesi, Indonesia.");
        dataDestinationHome.add(h6);

        Home h7 = new Home();
        h7.setNamaDestinationHome("Bogani Nani Wartabone National Park");
        h7.setKotaDestinationHome("Sulawesi Utara");
        h7.setKeteranganDestinationHome("Bogani Nani Wartabone National Park is a 2,871 km² National Park on Minahassa Peninsula on Sulawesi island.");
        dataDestinationHome.add(h7);

        Home h8 = new Home();
        h8.setNamaDestinationHome("Kepulauan Togean National Park");
        h8.setKotaDestinationHome("Sulawesi Tenggara");
        h8.setKeteranganDestinationHome("Kepulauan Togean National Park is a largely marine national park, including the Togian Islands.");
        dataDestinationHome.add(h8);

        Home h9 = new Home();
        h9.setNamaDestinationHome("Lake Poso");
        h9.setKotaDestinationHome("Sulawesi Tenggara");
        h9.setKeteranganDestinationHome("Lake Poso is a lake in Central Sulawesi, Indonesia, and the third-deepest lake in Indonesia.");
        dataDestinationHome.add(h9);

        Home h10 = new Home();
        h10.setNamaDestinationHome("Palopo");
        h10.setKotaDestinationHome("Sulawesi Selatan");
        h10.setKeteranganDestinationHome("Palopo or Kota Palopo is one of the autonomous cities in South Sulawesi Province of Indonesia.");
        dataDestinationHome.add(h10);

        return dataDestinationHome;
    }

}
