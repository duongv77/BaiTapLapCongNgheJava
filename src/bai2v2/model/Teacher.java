package bai2v2.model;

import java.text.NumberFormat;

import static Utils.Helper.*;

public class Teacher extends Person {
    private Double gioDay;

    private Integer luongCoBan;

    private Integer phuCap;

    public Teacher() {
    }

    public Teacher(String hoTen, String namSinh, String queQuan, Double gioDay) {
        super(hoTen, namSinh, queQuan);
        this.gioDay = gioDay;
    }

    public Teacher(String hoTen, String namSinh, String queQuan, Double gioDay, Integer luongCoBan, Integer phuCap) {
        this(hoTen, namSinh, queQuan, gioDay);
        this.luongCoBan = luongCoBan;
        this.phuCap = phuCap;
    }

    @Override
    public void print() {
        super.print();
        printPretty(String.format("Số giờ dạy: %.2f", gioDay));
        printPretty(String.format("Thu nhập của giảng viên: %s", thuNhap()));
    }

    @Override
    public void importValue() {
        super.importValue();
        gioDay = IMPORT_DOUBLE("Nhập số giờ dạy: ", null, 0D);
        luongCoBan = IMPORT_INT("Nhập lương cơ bản:", null, 0);
        phuCap = IMPORT_INT("Nhập phụ cấp:", null, 0);
    }

    public String thuNhap() {
        return String.format("%s VNĐ", formatNumber( luongCoBan + phuCap));
    }

    public Double getGioDay() {
        return gioDay;
    }

    public void setGioDay(Double gioDay) {
        this.gioDay = gioDay;
    }

    public Integer getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Integer luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public Integer getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(Integer phuCap) {
        this.phuCap = phuCap;
    }
}
