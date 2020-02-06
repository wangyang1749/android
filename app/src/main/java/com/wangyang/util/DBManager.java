package com.wangyang.util;

import android.content.Context;

public class DBManager {
    private static MySqliteHelper helper;
    public static MySqliteHelper getInstance(Context context){
        if(helper==null){
            helper = new MySqliteHelper(context);
        }
        return helper;
    }
}
