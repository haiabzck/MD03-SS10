package Exercise2;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book() {
    }
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
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
    public void inputData(Scanner scanner) {
        System.out.print("Nhập tên sách : ");
        while (true){
            title = scanner.nextLine().trim();
            if(title.isEmpty()){
                System.out.println("Vui lòng không để trống");
            }else {
                break;
            }
        }
        System.out.print("Nhập tác giả : ");
        while (true){
            author = scanner.nextLine().trim();
            if (author.isEmpty()){
                System.out.println("Vui lòng không để trống");
            }else {
                break;
            }
        }
        System.out.print("Nhập năm xuất bản : ");
        while (true){
            try {
                String input = scanner.nextLine();
                if(input.isEmpty()){
                    System.out.println(" Vui lòng không để trống ");
                }else {
                    year = Integer.parseInt(input);
                    if(year < 0){
                        System.out.println("Vui lòng nhập số nguyên > 0");
                    }else {
                        break;
                    }
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập số nguyên > 0");
            }
        }
    }
    public String toString() {
        return "Tên : " + title + " , Tác giả : " + author + " , Năm xuất bản : " + year + " ";
    }
}
