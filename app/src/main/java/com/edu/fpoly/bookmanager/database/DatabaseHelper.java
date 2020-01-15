package com.edu.fpoly.bookmanager.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import com.edu.fpoly.bookmanager.dao.NguoiDungDAO;
import com.edu.fpoly.bookmanager.model.NguoiDung;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="dbBookManager";
    public static final int DATABASE_VERSION=1;
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(NguoiDungDAO.SQL_NGUOI_DUNG);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists"+NguoiDungDAO.TABLE_NAME);
    }
}
