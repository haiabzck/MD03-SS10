package Exercise10;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1000,"M");
        map.put(900,"CM");
        map.put(500,"D");
        map.put(400,"CD");
        map.put(100,"C");
        map.put(90,"XC");
        map.put(50,"L");
        map.put(40,"XL");
        map.put(10,"X");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(4,"IV");
        map.put(1,"I");

        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            System.out.print("Nhập vào một số nguyên dương N (1 - 3999): ");
            if (scanner.hasNextInt()) {
                number = Integer.parseInt(scanner.nextLine());
                if (number >= 1 && number <= 3999) {
                        break;
                }
                System.out.println("Giá trị không hợp lệ! Vui lòng nhập lại.");
            } else {
            scanner.nextLine();
            System.out.println("Giá trị không hợp lệ! Vui lòng nhập lại.");
            }
        }
        int originalNumber = number;
        StringBuilder romanString = new StringBuilder();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            while (number >= value) {
                romanString.append(symbol);
                number -= value;
            }
        }
        System.out.println("Số " + originalNumber + " chuyển sang chữ số La Mã là: " + romanString);
        scanner.close();
    }
}
