package Exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private final List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Chưa có sinh viên nào trong danh sách !");
        }else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager();
        while (true){
            Student student = new Student();
            student.inputData(scanner);
            studentManager.addStudent(student);
            boolean isAdd = false;
            System.out.println("Bạn có muốn nhập thêm sinh viên khác ? (Y/N) : ");
            while (true){
                String choice = scanner.nextLine().toUpperCase();
                if (choice.equals("N")) {
                    isAdd = true;
                    break;
                }else if (choice.equals("Y")) {
                    break;
                }else {
                    System.out.print("Vui lòng nhập Y/N :");
                }
            }
            if (isAdd) {
                break;
            }
        }
        studentManager.displayStudents();
    }
}
