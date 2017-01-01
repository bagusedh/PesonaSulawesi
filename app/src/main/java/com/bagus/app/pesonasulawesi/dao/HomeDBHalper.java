package com.bagus.app.pesonasulawesi.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by bagus on 26/12/16.
 */

public class HomeDBHalper extends SQLiteOpenHelper {

    private static final String SQL_CREATE_HOME = "create table "+ SkemaDatabaseHome.TabelHome.TABLE_NAME +" (" +
            SkemaDatabaseHome.TabelHome._ID + " integer primary key," +
            SkemaDatabaseHome.TabelHome.COLUMN_NAME_NAMA + " TEXT," +
            SkemaDatabaseHome.TabelHome.COLUMN_NAME_KOTA + " TEXT," +
            SkemaDatabaseHome.TabelHome.COLUMN_NAME_KETERANGAN + " TEXT " +
            " )";

    private static final String SQL_DROP_HOME = "drop table if exists "+SkemaDatabaseHome.TabelHome.TABLE_NAME;

    public HomeDBHalper(Context context) {
        super(context, SkemaDatabaseHome.DATABASE_NAME, null, SkemaDatabaseHome.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_HOME);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DROP_HOME);
        onCreate(db);

    }
}
