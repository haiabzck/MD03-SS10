package Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderManager order = new OrderManager();
        int choice;
        while (true) {
            System.out.println("**********Menu Quản Lý Hóa Đơn **********");
            System.out.println("1. Thêm Hóa Đơn");
            System.out.println("2. Sửa Hóa Đơn");
            System.out.println("3. Xóa Hóa Đơn");
            System.out.println("4. Hiển Thị Hóa Đơn");
            System.out.println("5. Thoát");

            choice = Exercise5.InputData.getInt(scanner, "Lựa chọn của bạn: ");

            switch (choice){
                case 1:
                    String orderCode = InputData.getString(scanner,"Nhập mã đơn hàng :");
                    String nameOrder = InputData.getString(scanner, "Nhập tên khách hàng: ");
                    order.add(new Order( orderCode, nameOrder));
                    break;
                case 2:
                    String orderCodeUpdate = InputData.getString(scanner, "Nhập mã đơn hàng cần sửa: ");
                    int indexUpdate = -1;
                    for (int i = 0; i < order.orders.size(); i++) {
                        if((order.orders.get(i).getOrderCode()).equals(orderCodeUpdate)){
                            indexUpdate = i;
                            break;
                        }
                    }
                    if(indexUpdate == -1){
                        System.out.println("Không tìm thấy đơn hàng có Mã ĐH : " + orderCodeUpdate);
                        break;
                    }else {
                        String nameUpdate = InputData.getString(scanner,"Nhập tên khách hàng mới :");
                        order.update(indexUpdate, new Order(orderCodeUpdate, nameUpdate));
                        System.out.println("Sửa thành công !");
                        break;
                    }
                case 3:
                    order.display();
                    String idDelete = InputData.getString(scanner,"Nhập mã đơn hàng cần xóa  :");
                    int indexDelete = -1;
                    for (int i = 0; i < order.orders.size(); i++) {
                        if((order.orders.get(i).getOrderCode()).equals(idDelete)){
                            indexDelete = i;
                            break;
                        }
                    }
                    if(indexDelete == -1) {
                        System.out.println("Không tìm thấy hóa đơn nào có id = " + idDelete);
                    }else {
                        order.delete(indexDelete);
                        System.out.println("Hóa đơn đã được xoa thành công.");
                    }
                    break;
                case 4:
                    order.display();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }
}
