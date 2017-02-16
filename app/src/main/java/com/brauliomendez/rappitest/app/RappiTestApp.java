package com.brauliomendez.rappitest.app;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by BraulioMendez on 2/14/17.
 */

public class RappiTestApp extends Application {

    @Override public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
