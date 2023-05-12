package bai2v1;

import bai2v1.model.SinhVienCNTT;
import bai2v1.model.SinhVienKinhTe;

import java.util.ArrayList;
import java.util.List;

import static Utils.Helper.*;

public class Application {
    public static void main(String[] args) {
        String loaiSV = IMPORT_STRING("Chọn loại sinh viên: \nA: Sinh viên công nghệ thông tin \tB: Sinh viên kinh tế");
        switch (loaiSV.toUpperCase()) {
            case "A" -> sinhVienCNTT();
            case "B" -> sinhVienKinhTe();
            default -> printLog("Lựa chọn không chính xác");
        }
        printLog("----END----");
    }

    private static void sinhVienCNTT(){
        int number = IMPORT_INT("Nhập số lượng sinh viên", null, 0);
        List<SinhVienCNTT> listSinhVien = new ArrayList<>();
        for(int i = 0; i<number; i++){
            printLog(String.format("Nhập thông tin sinh viên thứ %d:", i+1));
            SinhVienCNTT sinhVienCNTT = new SinhVienCNTT();
            sinhVienCNTT.input();
            listSinhVien.add(sinhVienCNTT);
            printLog("\n");
        }
        listSinhVien.forEach(elm->{
            printLog(String.format("---- Xuất thông tin sinh viên %s ----", elm.getHoTen()));
            elm.print();
            printLog("\n");
        });
    }

    private static void sinhVienKinhTe(){
        int number = IMPORT_INT("Nhập số lượng sinh viên", null, 0);
        List<SinhVienKinhTe> listSinhVien = new ArrayList<>();
        for(int i = 0; i<number; i++){
            printLog(String.format("Nhập thông tin sinh viên thứ %d:", i+1));
            SinhVienKinhTe SinhVienKinhTe = new SinhVienKinhTe();
            SinhVienKinhTe.input();
            listSinhVien.add(SinhVienKinhTe);
            printLog("\n");
        }
        listSinhVien.forEach(elm->{
            printLog(String.format("---- Xuất thông tin sinh viên %s ----", elm.getHoTen()));
            elm.print();
            printLog("\n");
        });
    }

}
