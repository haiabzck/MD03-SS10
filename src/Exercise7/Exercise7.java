package Exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        while (true){
            System.out.println("************ Menu Quản Lý SinhVien ************");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Phân loại sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Lựa chọn của bạn :");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.print("Nhập số lượng sinh viên muốn thêm :");
                    int n = Integer.parseInt(scanner.nextLine());
                    if(n < 5){
                        System.out.println("Số lượng sinh viên phải lớn hơn 5 !");
                        break;
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập sinh viên thứ "+(i+1));
                        int id =InputData.getInt(scanner,"Nhập ID sinh viên :");
                        String name = InputData.getString(scanner,"Nhập tên sinh viên : ");
                        double gpa = InputData.getDouble(scanner,"Nhập điểm TB sinh viên : ");
                        Student student = new Student(id,name,gpa);
                        studentManager.addStudent(student);
                    }
                    System.out.println("Thêm sinh viên thành công !");
                    break;
                case 2:
                    System.out.println("Danh sách sinh viên :");
                    studentManager.display();
                    break;
                case 3:
                    String searchName = InputData.getString(scanner,"Nhập tên sinh viên muốn tìm :");
                    studentManager.findStudent(searchName.toLowerCase());
                    break;
                case 4:
                    studentManager.displayClassifiedStudents();
                    break;
                case 5:
                    System.out.println("Thoát chương trình thành công !");
                    return;
                default:
                    System.out.println("Vui lòng nhập số từ 1 - 5 !");
            }
        }
    }
}
