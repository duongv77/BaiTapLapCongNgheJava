package bai1;

import Utils.Helper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static Utils.Helper.*;

public class Application {

    public static void main(String[] args) {
        printLog("Mời chọn chương trình:");
        List<String> listFunction = initFunction();
        listFunction.forEach(Helper::printLog);
        boolean run = true;
        while (run){
            Integer result = IMPORT_INT("Mời bạn chọn chương trình:", 6, 1);
            switch (result) {
                case 1 -> {
                    printLog(listFunction.get(0));
                    PhuongTrinhBac1.main(args);
                }
                case 2 -> {
                    printLog(listFunction.get(1));
                    FilterMinMax.main(args);
                }
                case 3 -> {
                    printLog(listFunction.get(2));
                    TinhTienThucLinh.main(args);
                }
                case 4 -> {
                    printLog(listFunction.get(3));
                    TamGiac.main(args);
                }
                case 5 -> {
                    printLog(listFunction.get(4));
                    NumberOfDays.main(args);
                }
                case 6 -> {
                    printLog(listFunction.get(5));
                    PersonalityTest.main(args);
                }
            }
            String luaChon = IMPORT_STRING("Bạn muốn tiếp tục chương trình không?\n Y: có    N: Không");
            run = Objects.equals(luaChon.toLowerCase(), "y");
        }
        printLog("----------EXIT DUONGDV----------");
    }

    public static List<String> initFunction(){
        List<String> listFunction = new ArrayList<>();
        listFunction.add("1: Viết chương trình giải bài toán phương trình bậc nhất ax2+bx+c=0 \n" +
                "với a, b, c được nhập vào từ bàn phím\n");
        listFunction.add("2: Viết chương trình nhập vào a, b, c. Tìm số lớn nhất, số nhỏ nhất");
        listFunction.add("3: Viết chương trình nhập bậc lương (BacLuong), ngày công " +
                "(NgayCong), phụ cấp (PhuCap).\n Tính tiền thực lĩnh (TienLinh) = " +
                "BacLuong * 1500000 * NCTL + PhuCap \nVới: NCTL = NgayCong nếu NgayCong < 25 \n" +
                "NCTL = (NgayCong – 25) * 2 + 25 nếu NgayCong >= 25\n");
        listFunction.add("4: Nhập vào độ dài 3 cạnh của tam giác, kiểm tra độ dài 3 cạnh lập \n" +
                "thành tam giác thì tính chu vi, diện tích của tam giác đó.\n");
        listFunction.add("5: Viết chương trình nhập vào tháng, năm. Thông báo ra màn hình số\n" +
                "ngày của tháng năm đó. (Biết tháng 1,3,5,7,8,10,12 có 31 ngày. Tháng\n" +
                "4,6,9,11 có 30 ngày. Năm chia hết cho 4 thì tháng 2 có 29 ngày");
        listFunction.add("6: Viết một chương trình trắc nghiệm tính cách qua màu sắc mà bạn thích:\n" +
                "- Nhập vào màu sắc: xanh, đỏ, tím, vàng, hồng, trắng\n" +
                "- Thông báo ra màn hình tính cách của người thích màu sắc đó\n" +
                "Nếu nhập vào màu sắc khác thì chương trình thông báo: “Chương trình\n" +
                "đang cập nhật!”\n");
        return listFunction;
    }

}
