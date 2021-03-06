package com.devmasterteam.festafimdeano.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPrefences {

    private final SharedPreferences mSharedPreferences;

    public SecurityPrefences(Context context){
        this.mSharedPreferences = context.getSharedPreferences("FimDeAno", Context.MODE_PRIVATE);
    }

    public void storeString(String key, String value){
        this.mSharedPreferences.edit().putString(key, value).apply();
    }

    public String getStoredString(String key){
        return this.mSharedPreferences.getString(key, "");
    }

}
