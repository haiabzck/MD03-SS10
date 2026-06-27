package Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InvoiceManager invoice = new InvoiceManager();
        int choice;
        while (true) {
            System.out.println("**********Menu Quản Lý Hóa Đơn **********");
            System.out.println("1. Thêm Hóa Đơn");
            System.out.println("2. Sửa Hóa Đơn");
            System.out.println("3. Xóa Hóa Đơn");
            System.out.println("4. Hiển Thị Hóa Đơn");
            System.out.println("5. Thoát");

            choice = InputData.getInt(scanner, "Lựa chọn của bạn: ");

            switch (choice){
                case 1:
                    int id = InputData.getInt(scanner, "Nhập ID: ");
                    String invoiceCode = InputData.getString(scanner,"Nhập mã hóa đơn :");
                    double amount = InputData.getDouble(scanner, "Nhập giá: ");
                    invoice.add(new Invoice(id,invoiceCode, amount));
                    break;
                case 2:
                    int index = InputData.getInt(scanner, "Nhập id cần sửa: ");
                    int indexUpdate = -1;
                    for (int i = 0; i < invoice.invoices.size(); i++) {
                        if(invoice.invoices.get(i).getId() == index){
                            indexUpdate = i;
                            break;
                        }
                    }
                    if(indexUpdate == -1){
                        System.out.println("Không tìm thấy hóa đơn có ID: " + index);
                    }else {
                        String invoiceCodeUpdate = InputData.getString(scanner,"Nhập mã hóa đơn mới :");
                        double amountUpdate = InputData.getDouble(scanner, "Nhập giá mới: ");
                        invoice.update(indexUpdate, new Invoice(index, invoiceCodeUpdate, amountUpdate));
                        System.out.println("Sửa thành công !");
                        break;
                    }
                case 3:
                    invoice.display();
                    int idDelete = InputData.getInt(scanner,"Nhập id hóa đơn cần xóa  :");
                    int indexDelete = -1;
                    for (int i = 0; i < invoice.invoices.size(); i++) {
                        if(invoice.invoices.get(i).getId() == idDelete){
                            indexDelete = i;
                            break;
                        }
                    }
                    if(indexDelete == -1) {
                        System.out.println("Không tìm thấy hóa đơn nào có id = " + idDelete);
                    }else {
                        invoice.delete(indexDelete);
                        System.out.println("Hóa đơn đã được xoa thành công.");
                    }
                    break;
                case 4:
                    invoice.display();
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
