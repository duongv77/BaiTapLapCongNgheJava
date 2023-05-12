package bai2v1.model;

import static Utils.Helper.*;

public class SinhVien {
    private String maSV;

    private String hoTen;

    private String ngaySinh;

    private String gioiTinh;

    private Double tinDaiCuong;

    private Double chinhTri;

    private Double phapLuat;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String ngaySinh, String gioiTinh, Double tinDaiCuong, Double chinhTri, Double phapLuat) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.tinDaiCuong = tinDaiCuong;
        this.chinhTri = chinhTri;
        this.phapLuat = phapLuat;
    }

    public Double sum(){
        return tinDaiCuong+chinhTri+phapLuat;
    }

    public void input(){
        maSV = IMPORT_STRING("Nhập mã sinh viên:");
        hoTen = IMPORT_STRING("Nhập tên sinh viên:");
        ngaySinh = IMPORT_STRING("Nhập ngày sinh:");
        gioiTinh = IMPORT_STRING("Nhập giới tính:");
        tinDaiCuong = IMPORT_DOUBLE("Nhập điểm môn tin đại cương:", 10D,0D);
        chinhTri = IMPORT_DOUBLE("Nhập điểm môn chính trị:", 10D,0D);
        phapLuat = IMPORT_DOUBLE("Nhập điểm môn pháp luật:", 10D,0D);
    }

    public void print(){
        printPretty(String.format("Mã sinh viên: %s", maSV));
        printPretty(String.format("Tên sinh viên: %s", hoTen));
        printPretty(String.format("Ngày sinh sinh viên: %s", ngaySinh));
        printPretty(String.format("Giới tính sinh viên: %s", gioiTinh));
        printPretty(String.format("Điểm môn tin đại cương: %.2f", tinDaiCuong));
        printPretty(String.format("Điểm môn chính trị: %.2f", chinhTri));
        printPretty(String.format("Điểm môn pháp luật: %.2f", phapLuat));
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Double getTinDaiCuong() {
        return tinDaiCuong;
    }

    public void setTinDaiCuong(Double tinDaiCuong) {
        this.tinDaiCuong = tinDaiCuong;
    }

    public Double getChinhTri() {
        return chinhTri;
    }

    public void setChinhTri(Double chinhTri) {
        this.chinhTri = chinhTri;
    }

    public Double getPhapLuat() {
        return phapLuat;
    }

    public void setPhapLuat(Double phapLuat) {
        this.phapLuat = phapLuat;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
}
