package com.edu.fpoly.bookmanager.model;

public class NguoiDung {
    private String userName,userPass,phone,hoTen;

    public NguoiDung(String userName, String userPass, String phone, String hoTen) {
        this.userName = userName;
        this.userPass = userPass;
        this.phone = phone;
        this.hoTen = hoTen;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
