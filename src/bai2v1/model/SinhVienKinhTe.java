package bai2v1.model;

import static Utils.Helper.*;
public class SinhVienKinhTe extends SinhVien{
    private Double kinhTeViMoMin;

    private Double kinhTeViMoMax;

    private Double luatKinhTe;

    public SinhVienKinhTe() {
    }

    public SinhVienKinhTe(String maSV, String hoTen, String ngaySinh, String gioiTinh, Double tinDaiCuong,
                          Double chinhTri, Double phapLuat, Double kinhTeViMoMin, Double kinhTeViMoMax, Double luatKinhTe) {
        super(maSV, hoTen, ngaySinh, gioiTinh, tinDaiCuong, chinhTri, phapLuat);
        this.kinhTeViMoMin = kinhTeViMoMin;
        this.kinhTeViMoMax = kinhTeViMoMax;
        this.luatKinhTe = luatKinhTe;
    }

    @Override
    public void input() {
        super.input();
        kinhTeViMoMin = IMPORT_DOUBLE("Nhập điểm kinh tế vi mô:", 10D,0D);
        kinhTeViMoMax = IMPORT_DOUBLE("Nhập điểm kinh tế vĩ mô:", 10D,0D);
        luatKinhTe = IMPORT_DOUBLE("Nhập điểm luật kinh tế:", 10D,0D);
    }
    @Override
    public void print() {
        super.print();
        printPretty(String.format("Điểm kinh tế vi mô: %.2f", kinhTeViMoMin));
        printPretty(String.format("Điểm kinh tế vĩ mô: %.2f", kinhTeViMoMax));
        printPretty(String.format("Điểm luật kinh tế: %.2f", luatKinhTe));
        printPretty(String.format("Điểm trung bình môn: %.2f", avg()));
    }

    public Double avg() {
        double sum = kinhTeViMoMin + kinhTeViMoMax + luatKinhTe;
        double sumParent = super.sum();
        if ((sumParent + sum) == 0) return 0D;
        else return (sumParent + sum) / 6;
    }

    public Double getKinhTeViMoMin() {
        return kinhTeViMoMin;
    }

    public void setKinhTeViMoMin(Double kinhTeViMoMin) {
        this.kinhTeViMoMin = kinhTeViMoMin;
    }

    public Double getKinhTeViMoMax() {
        return kinhTeViMoMax;
    }

    public void setKinhTeViMoMax(Double kinhTeViMoMax) {
        this.kinhTeViMoMax = kinhTeViMoMax;
    }

    public Double getLuatKinhTe() {
        return luatKinhTe;
    }

    public void setLuatKinhTe(Double luatKinhTe) {
        this.luatKinhTe = luatKinhTe;
    }
}
