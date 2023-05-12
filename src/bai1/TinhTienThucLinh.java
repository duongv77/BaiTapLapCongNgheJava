package bai1;

import java.io.IOException;

import static Utils.Helper.*;
import static Utils.Helper.IMPORT_INT;

public class TinhTienThucLinh {
    public static void main(String[] args) {
        Integer bacLuong = IMPORT_INT("Nhập bậc lương: ", null, 0);
        Integer ngayCong = IMPORT_INT("Nhập số ngày công: ", null, 0);
        Integer phuCap = IMPORT_INT("Nhập phụ cấp: ", null, 0);
        int nctl;
        if (ngayCong < 25) {
            nctl = ngayCong;
        } else {
            nctl = (ngayCong - 25) * 2 + 25;
        }

        int tienLinh = bacLuong * 1500000 * nctl + phuCap;

        printLog("Tiền lương thực tiễn là: " + tienLinh);
    }
}
