package bai2v2.model;

import static Utils.Helper.*;

public class Person {
    private String hoTen;
    private String namSinh;
    private String queQuan;

    public Person() {
    }

    public Person(String hoTen, String namSinh, String queQuan) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.queQuan = queQuan;
    }

    public void importValue(){
        hoTen = IMPORT_STRING("Nhập họ và tên:");
        namSinh = IMPORT_STRING("Nhập năm sinh:");
        queQuan = IMPORT_STRING("Nhập quê quán:");
    }

    public void print(){
        printPretty(String.format("Họ và tên: %s", hoTen));
        printPretty(String.format("Năm sinh: %s", namSinh));
        printPretty(String.format("Quê quán: %s", queQuan));
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
