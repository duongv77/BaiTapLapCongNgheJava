package bai1;

import static Utils.Helper.*;

public class PersonalityTest {
    public static void main(String[] args) {

        String color = IMPORT_STRING("Nhập vào màu sắc bạn thích (xanh, đỏ, tím, vàng, hồng, trắng): ");

        String personality = getPersonality(color);
        if (personality != null) {
            printLog(String.format("Tính cách của bạn khi thích màu %s là: %s", color, personality));
        } else {
            printLog("Chương trình đang cập nhật!");
        }
    }

    public static String getPersonality(String color) {
        color = color.toLowerCase();
        return switch (color) {
            case "xanh" -> "Hòa đồng, tự nhiên";
            case "đỏ", "do" -> "Năng động, quyết đoán";
            case "tím", "tim" -> "Sáng tạo, tinh tế, mộng mơ";
            case "vàng", "vang" -> "Vui vẻ, nhiệt huyết";
            case "hồng", "hong" -> "Dịu dàng, lãng mạn";
            case "trắng", "trang" -> "Thanh lịch, tinh khôi";
            default -> null;
        };
    }
}
