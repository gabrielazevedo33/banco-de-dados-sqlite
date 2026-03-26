package com.example.bancodedadossqlite.datasource;

import android.app.AppComponentFactory;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.fabio.bancodedadossqlite.api.AppUtil;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME = "Loja.sqlite";
    public static int version = 1;
    public AppDataBase( Context context ) {
        super(context, DB_NAME, null, version);
        Log.i(AppUtil.TAG, "AppDataBase: Conectando o banco");
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
