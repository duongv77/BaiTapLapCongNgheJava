package bai1;

import static Utils.Helper.*;

public class TamGiac {
    public static void main(String[] args) {
        Double sideA = IMPORT_DOUBLE("Nhập cạnh a:", null, null);
        Double sideB = IMPORT_DOUBLE("Nhập cạnh b:", null, null);
        Double sideC = IMPORT_DOUBLE("Nhập cạnh c:", null, null);

        if (isCheck(sideA, sideB, sideC)) {
            double perimeter = calculatePerimeter(sideA, sideB, sideC);
            double area = calculateArea(sideA, sideB, sideC);

            printLog("P = " + perimeter);
            printLog("S = " + area);
        } else {
            printLog("Ba cạnh không lập thành tam giác.");
        }
    }
    public static boolean isCheck(double sideA, double sideB, double sideC) {
        return (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA);
    }

    public static double calculatePerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }

    public static double calculateArea(double sideA, double sideB, double sideC) {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
