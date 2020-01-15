package com.edu.fpoly.bookmanager.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.edu.fpoly.bookmanager.database.DatabaseHelper;
import com.edu.fpoly.bookmanager.model.NguoiDung;

public class NguoiDungDAO {
    public static final String SQL_NGUOI_DUNG="CREATE TABLE NguoiDung(" +
            "userName text primary key, " +
            "userPass text, " +
            "phone text, " +
            "hoTen text);";
    public static final String TABLE_NAME="NguoiDung";
    public static final String TAG="NguoiDungDAO";

    private SQLiteDatabase db;
    private DatabaseHelper dbhelper;

    public NguoiDungDAO(Context context) {
        dbhelper=new DatabaseHelper(context);
        db=dbhelper.getWritableDatabase();
    }


    public int insertNguoiDung(NguoiDung n){
        ContentValues contentValues = new ContentValues();
        contentValues.put("userName",n.getUserName());
        contentValues.put("userPass",n.getUserPass());
        contentValues.put("phone",n.getPhone());
        contentValues.put("hoTen",n.getHoTen());
        try {
            if(db.insert(TABLE_NAME,null,contentValues)==-1){
                return -1;
            };
        }catch (Exception e){
            Log.e(TAG,e.toString());
        }
        return 1;
    };
}
