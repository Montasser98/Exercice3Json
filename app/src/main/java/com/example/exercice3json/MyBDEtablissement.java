package com.example.exercice3json;

import android.content.ContentValues;
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
        String sql = "create table " + TABLE_NAME + "(" + COL1 + " text primary key," + COL2 + " text," + COL3 + " text," + COL4 + " integer)";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE " + TABLE_NAME;
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
    public static long insert_filiere(SQLiteDatabase sqLiteDatabase, Filiere fil){
        ContentValues ct = new ContentValues();
        ct.put(COL1, fil.getCode());
        ct.put(COL2, fil.getDescription());
        ct.put(COL3, fil.getNiveau());
        ct.put(COL4, fil.getNbModule());
        return  sqLiteDatabase.insert(TABLE_NAME,null,ct);

    }
}
