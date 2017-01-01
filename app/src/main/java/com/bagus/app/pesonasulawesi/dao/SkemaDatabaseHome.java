package com.bagus.app.pesonasulawesi.dao;

import android.provider.BaseColumns;

/**
 * Created by bagus on 26/12/16.
 */

public final class SkemaDatabaseHome {

    public static final String DATABASE_NAME = "Home.db";
    public static final Integer DATABASE_VERSION = 1;




    //tidak bisa menginstankan
    //tidak bisa new skema database
    private SkemaDatabaseHome(){}

    //skema tabel home
    public abstract class TabelHome implements BaseColumns{
        public static final String TABLE_NAME = "home";
        public static final String COLUMN_NAME_HOME_ID = "home_id";
        public static final String COLUMN_NAME_NAMA = "nama";
        public static final String COLUMN_NAME_KOTA = "kota";
        public static final String COLUMN_NAME_KETERANGAN = "keterangan";

    }

}