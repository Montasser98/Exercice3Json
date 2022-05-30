package com.example.exercice3json;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public abstract class MyBDEtablissement extends SQLiteOpenHelper {
    public static String DB_NAME="DBFiliere.db";
    public static String TABLE_NAME="Filiere";
    public static String COL1="code";
    public static String COL2="description";
    public static String COL3="niveau";
    public static String COL4="nbModule";

    public MyBDEtablissement(Context c) {
        super(c,DB_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
