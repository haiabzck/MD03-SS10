package Exercise2;

import java.util.HashMap;
import java.util.Scanner;

public class BookManager {
    private HashMap<String,Book> books = new HashMap<>();
    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public Book findBook(String title) throws Exception {
       if(!books.containsKey(title)) {
           throw new Exception("Sách không tồn tại");
       }
       return books.get(title);
    }

    public void displayBook(){
        if(books.isEmpty()){
            System.out.println("Chưa có sách nào trong danh sách !");
        }else {
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager bookManager = new BookManager();
        while (true){
            System.out.println("************ Menu Quản Lý Sách ************");
            System.out.println("1. Thêm sách");
            System.out.println("2. Tìm kiếm sách");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn : ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    Book book = new Book();
                    book.inputData(scanner);
                    bookManager.addBook(book);
                    System.out.println("Thêm sách thành công !");
                    break;
                case 2:
                    System.out.print("Nhập tên sách muốn tìm : ");
                    String inputTitle = scanner.nextLine().trim();
                    try {
                      Book foundBook  =  bookManager.findBook(inputTitle);
                      System.out.println("Thông tin sách tìm thấy: "+foundBook);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    bookManager.displayBook();
                    break;
                case 4:
                    System.out.println("Thoát chương trình thành công !");
                    return;
                default:
                    System.out.println("Vui lòng nhập số từ 1 - 4 !");
            }
        }
    }
}
