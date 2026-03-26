package com.example.bancodedadossqlite.controller;

import android.content.Context;
import android.util.Log;

import com.example.bancodedadossqlite.api.AppUtil;
import com.example.bancodedadossqlite.datasource.AppDataBase;

public class ClienteController extends AppDataBase {
    public ClienteController(Context context) {
        super(context);
        Log.i(AppUtil.TAG, "CienteController: Conectado ao banco");

    }
}
