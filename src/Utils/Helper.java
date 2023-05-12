package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Helper {
    public static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void  printLog(String message) {
        System.setProperty("file.encoding", "UTF-8");
        PrintWriter writer = new PrintWriter(System.out, true, StandardCharsets.UTF_8);
        writer.println(message);
    }

    public static void printPretty(String message) {
        System.setProperty("file.encoding", "UTF-8");
        PrintWriter writer = new PrintWriter(System.out, true, StandardCharsets.UTF_8);
        List<String> list = Arrays.asList(message.split(":"));
        writer.printf(String.format("%-40s:", list.get(0)));
        writer.println(list.get(1));
    }

    public static Integer IMPORT_INT(String message, Integer max, Integer min) {
        printLog(message);
        try {
            Integer value = parseInt(reader.readLine());
            if(max != null && min == null && value <= max)
                return value;
            if(max == null && min != null && value >= min)
                return value;
            if(max != null && min != null && value <= max && value >= min)
                return value;
            if(max == null && min == null)
                return value;
            printLog("Giá trị không hợp lệ");
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Double IMPORT_DOUBLE(String message, Double max, Double min) {
        printLog(message);
        try {
            Double value = parseDouble(reader.readLine());
            if(max != null && min == null && value <= max)
                return value;
            if(max == null && min != null && value >= min)
                return value;
            if(max != null && min != null && value <= max && value >= min)
                return value;
            if(max == null && min == null)
                return value;
            printLog("Giá trị không hợp lệ");
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String IMPORT_STRING(String message) {
        printLog(message);
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer parseInt(Object value) {
        if (value == null) return null;
        try {
            return Integer.parseInt(String.valueOf(value));
        } catch (Exception parseException) {
            parseException.printStackTrace();
            return null;
        }
    }

    public static Double parseDouble(Object value) {
        if (value == null) return null;
        try {
            return Double.parseDouble(String.valueOf(value));
        } catch (Exception parseException) {
            parseException.printStackTrace();
            return null;
        }
    }
}
