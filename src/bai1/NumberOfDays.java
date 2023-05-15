package bai1;

import static Utils.Helper.*;

public class NumberOfDays {
    public static void main(String[] args) {

        Integer month = IMPORT_INT("Nhập tháng (1-12): ", 12, 1);
        Integer year = IMPORT_INT("Nhập vào năm: ", null, 0);
        Integer numberOfDays = getNumberOfDays(month, year);
        printLog(String.format("So ngày của tháng %d năm %d là: %s", month, year, numberOfDays));
    }

    public static int getNumberOfDays(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (year % 4 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
}
