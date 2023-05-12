package bai1;

import static Utils.Helper.*;

public class PhuongTrinhBac1 {
    public static void main(String[] args) {
        int a = IMPORT_INT("Nhập a:", null, null);
        int b = IMPORT_INT("Nhập b:", null, null);
        int c = IMPORT_INT("Nhập c:", null, null);

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            printLog("PT có 2 Nghiệm phân biệt:");
            printLog("x1 = " + x1);
            printLog("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            printLog("Phương trình có 2 nghiệm kép:");
            printLog("x = " + x);
        } else {
            printLog("Phương trình vô nghiệm.");
        }

    }
}
