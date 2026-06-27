package Exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();
        int choice = -1;
        while (true){
            System.out.println("************ Menu Quản Lý Người Dùng ************");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng");
            System.out.println("3. Hiển thị danh sách người dùng");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            try {
                choice = InputData.getInt(scanner,"Lựa chọn của bạn :");
                switch (choice){
                    case 1:
                        String name = InputData.getString(scanner,"Nhập tên người dùng");
                        String emai = InputData.getString(scanner,"Nhập email người dùng");
                        String numberPhone = InputData.getString(scanner,"Nhập số điện thoại người dùng");
                        User user = new User(name, emai, numberPhone);
                        userManager.add(user);
                        System.out.println("Thêm người dùng thành công!");
                        break;
                    case 2:
                        String inputEmail = InputData.getString(scanner,"Nhập email người dùng cần xóa :");
                        if (userManager.removeUser(inputEmail)){
                            System.out.println("Xóa người dùng thành công!");
                        }else {
                            System.out.println("Người dùng không tồn tại!");
                        }
                        break;
                    case 3:
                        System.out.println("Danh sách người dùng :");
                        userManager.display();
                        break;
                    case 4:
                        System.out.println("Thoát chương trình thành công !");
                        return;
                    default:
                        System.out.println("Vui lòng nhập số từ 1 - 4 !");

                }
            }catch (NumberFormatException e){
                System.out.println("Lỗi nhập liệu! Vui lòng chọn một số hợp lệ.");
            }
        }
    }
}
