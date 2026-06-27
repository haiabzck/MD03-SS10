package Exercise7;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    public List<Student> students = new ArrayList<>();
    public void addStudent(Student student) {
        students.add(student);
    }
    public void display() {
        if(students.isEmpty()){
            System.out.println("Danh sách sinh viên trống !");
        }else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void findStudent(String name){
        if(students.isEmpty()){
            System.out.println("Danh sách sinh viên trống !");
            return;
        }
        for (Student student : students) {
            if (!student.getName().toLowerCase().equals(name)) {
                System.out.println("Không tìm thấy " + name + " trong danh sách !");

            } else {
                System.out.println(student);
                break;
            }
        }
    }
    public void displayClassifiedStudents() {
        if (students == null || students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }

        System.out.println("\n--- DANH SÁCH SINH VIÊN SAU KHI PHÂN LOẠI ---");
        for (Student student : students) {
            System.out.println("ID : "+student.getId()+", Tên : "+student.getName()+", Điểm TB : "+student.getGpa()+", Xếp loại : "+student.getRank());
        }
    }
}
