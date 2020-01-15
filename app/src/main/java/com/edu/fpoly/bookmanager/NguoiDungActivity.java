package com.edu.fpoly.bookmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.edu.fpoly.bookmanager.dao.NguoiDungDAO;
import com.edu.fpoly.bookmanager.model.NguoiDung;


public class NguoiDungActivity extends AppCompatActivity {
    Button btnThemNguoiDung;
    NguoiDungDAO nguoiDungDAO;

    EditText edUser, edPass,edRePass, edPhone, edFullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nguoi_dung);
        setTitle("THÊM NGƯỜI DÙNG");
        btnThemNguoiDung = findViewById(R.id.btnAddUser);
        edUser = findViewById(R.id.edUserName);
        edPass = findViewById(R.id.edPassword);
        edPhone = findViewById(R.id.edPhone);
        edFullName =findViewById(R.id.edFullName);
        edRePass = findViewById(R.id.edRePassword);
    }

    public void showUsers(View view) {
        finish();
    }


    public void addUser(View view) {
        nguoiDungDAO=new NguoiDungDAO(this);
        NguoiDung nguoiDung=new NguoiDung(edUser.getText().toString(),edPass.getText().toString(),edPhone.getText().toString(),edFullName.getText().toString());
        try {
            if(nguoiDungDAO.insertNguoiDung(nguoiDung)==1){
                Toast.makeText(getApplicationContext(),"Them Thanh cong",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(getApplicationContext(),"Them That bai",Toast.LENGTH_SHORT).show();
            }
        }catch (Exception e){
            Log.e("Loi",e.toString());
        }
    }
}
