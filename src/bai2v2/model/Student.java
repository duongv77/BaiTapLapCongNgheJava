package bai2v2.model;

import static Utils.Helper.*;

public class Student extends Person{
    private Double diemTrungBinh;

    public Student() {
    }

    public Student(String hoTen, String namSinh, String queQuan, Double diemTrungBinh) {
        super(hoTen, namSinh, queQuan);
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public void print() {
        super.print();
        printPretty(String.format("Điểm trung bình: %.2f", diemTrungBinh));
        printPretty(String.format("Xếp loại học sinh: %s", categoryStudent()));
    }

    @Override
    public void importValue() {
        super.importValue();
        diemTrungBinh = IMPORT_DOUBLE("Nhập điểm trung bình", 10D, 0D);
    }

    public String categoryStudent(){
        if(diemTrungBinh>=8) return "Giỏi";
        else if(diemTrungBinh >= 6.5) return "Khá";
        else if(diemTrungBinh >= 5) return "Trung bình";
        else return "Yếu";
    }

    public Double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
}
