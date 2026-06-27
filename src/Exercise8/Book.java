package Exercise8;

import java.util.Objects;

public class Book {
    private String id;
    private String title;
    private String author;
    private int year;

    public Book() {
    }

    public Book(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public boolean equals(Object o) {
        // Nếu cùng trỏ vào 1 vùng nhớ thì chắc chắn bằng nhau
        if (this == o) return true;

        // Nếu đối tượng truyền vào bị null hoặc không cùng Class thì không bằng nhau
        if (o == null || getClass() != o.getClass()) return false;

        // Ép kiểu về Book để so sánh thuộc tính id
        Book book = (Book) o;

        // So sánh giá trị id của 2 đối tượng
        return Objects.equals(id, book.id);
    }

    // 2. Ghi đè phương thức hashCode tương ứng với equals
    @Override
    public int hashCode() {
        // Sinh ra mã băm dựa duy nhất trên thuộc tính id
        return Objects.hash(id);
    }
    public String toString() {
        return "ID : " + id + " , Tên : " + title + " , Tác giả : " + author + " , Năm xuất bản : " + year + " ";
    }
}
