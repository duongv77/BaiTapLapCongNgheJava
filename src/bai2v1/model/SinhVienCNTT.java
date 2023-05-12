package bai2v1.model;

import static Utils.Helper.*;

public class SinhVienCNTT extends SinhVien {
    private Double CTDL_GT;

    private Double toanRR;

    private Double CSDL;

    private Double OOP;

    public SinhVienCNTT() {
    }

    public SinhVienCNTT(String maSV, String hoTen, String ngaySinh, String gioiTinh, Double tinDaiCuong,
                        Double chinhTri, Double phapLuat, Double CTDL_GT, Double toanRR, Double CSDL, Double OOP) {
        super(maSV, hoTen, ngaySinh, gioiTinh, tinDaiCuong, chinhTri, phapLuat);
        this.CTDL_GT = CTDL_GT;
        this.toanRR = toanRR;
        this.CSDL = CSDL;
        this.OOP = OOP;
    }

    @Override
    public void input() {
        super.input();
        CTDL_GT = IMPORT_DOUBLE("Nhập điểm môn CTDL GT:", 10D,0D);
        toanRR = IMPORT_DOUBLE("Nhập điểm môn toán rời rạc:", 10D,0D);
        CSDL = IMPORT_DOUBLE("Nhập điểm môn CTDL:", 10D,0D);
        OOP = IMPORT_DOUBLE("Nhập điểm môn lập trình hướng đối tượng:", 10D,0D);
    }

    @Override
    public void print() {
        super.print();
        printPretty(String.format("Điểm môn cấu trúc dữ liệu giải thuật: %.2f", CTDL_GT));
        printPretty(String.format("Điểm môn toán rời rạc: %.2f", toanRR));
        printPretty(String.format("Điểm môn cơ sở dữ liệu: %.2f", CSDL));
        printPretty(String.format("Điểm môn lập trình hướng đối tượng: %.2f", OOP));
        printPretty(String.format("Điểm trung bình môn: %.2f", avg()));
    }

    public Double avg() {
        double sum = CTDL_GT + toanRR + CSDL + OOP;
        double sumParent = super.sum();
        if ((sumParent + sum) == 0) return 0D;
        else return (sumParent + sum) / 7;
    }

    public Double getCTDL_GT() {
        return CTDL_GT;
    }

    public void setCTDL_GT(Double CTDL_GT) {
        this.CTDL_GT = CTDL_GT;
    }

    public Double getToanRR() {
        return toanRR;
    }

    public void setToanRR(Double toanRR) {
        this.toanRR = toanRR;
    }

    public Double getCSDL() {
        return CSDL;
    }

    public void setCSDL(Double CSDL) {
        this.CSDL = CSDL;
    }

    public Double getOOP() {
        return OOP;
    }

    public void setOOP(Double OOP) {
        this.OOP = OOP;
    }
}
