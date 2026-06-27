package Exercise8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BookManager {
    public HashSet<Book> books = new HashSet<>();
    public void addBook(Book book) {
        if (books.add(book)) {
            System.out.println("Thêm thành công cuốn sách: " + book.getTitle());
        } else {
            System.out.println("LỖI: Không thể thêm! Mã số sách '" + book.getId() + "' đã tồn tại.");
        }
    }
    public List<Book> addListBook(int year) {
         List<Book> listBooks = new ArrayList<>();
         for (Book book : books){
             if (book.getYear() > year){
                 listBooks.add(book);
             }
         }
        return listBooks;
    }
    public void display() {
        if(books.isEmpty()){
            System.out.println("Danh sách sinh viên trống !");
        }else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
