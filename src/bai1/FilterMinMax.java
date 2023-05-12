package bai1;

import static Utils.Helper.*;

public class FilterMinMax {
    public static void main(String[] args) {

        Double a = IMPORT_DOUBLE("Nhập a: ", null, null);
        Double b = IMPORT_DOUBLE("Nhập b: ", null, null);
        Double c = IMPORT_DOUBLE("Nhập c: ", null, null);

        double max = Math.max(a, Math.max(b, c));
        double min = Math.min(a, Math.min(b, c));

        printLog("Max: " + max);
        printLog("Min: " + min);
    }
}
