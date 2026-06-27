package Exercise8;

import java.util.Collections;
import java.util.List;

public class Exercise8 {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.addBook(new Book("B01", "Lập trình Java Cơ Bản", "Nguyễn Văn A", 2019));
        bookManager.addBook(new Book("B02", "Cấu trúc dữ liệu", "Trần Thị B", 2023));
        bookManager.addBook(new Book("B03", "Giải thuật nâng cao", "Lê Văn C", 2021));
        bookManager.addBook(new Book("B04", "Cơ sở dữ liệu SQL", "Phạm Minh D", 2025));
        bookManager.addBook(new Book("B01", "Java Web", "Nguyễn Văn A", 2024));

        int targetYear = 2020;
        List<Book> filteredBooks = bookManager.addListBook(targetYear);

        Collections.sort(filteredBooks, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));

        System.out.println("\n=== DANH SÁCH SÁCH XUẤT BẢN SAU NĂM " + targetYear + " (ĐÃ SẮP XẾP THEO TÊN) ===");
        if (filteredBooks.isEmpty()) {
            System.out.println("Không có cuốn sách nào thỏa mãn điều kiện!");
        } else {
            for (Book book : filteredBooks) {
                System.out.println(book); // Tự động gọi hàm toString() của lớp Book
            }
        }
    }
}
