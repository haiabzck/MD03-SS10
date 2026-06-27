package Exercise1;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private float averageScore;

    public Student(String name, int age, float averageScore) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        this.averageScore = averageScore;
    }
    public void inputData(Scanner scanner) {
        System.out.print("Nhập tên sinh viên : ");
        while (true){
            name = scanner.nextLine();
            if (name.isEmpty()){
                System.out.println("Vui lòng không để trống");
            }else {
                break;
            }
        }
        System.out.print("Nhập tuổi sinh viên : ");
        while (true){
            try {
                String ageInput = scanner.nextLine();
                if (ageInput.isEmpty()){
                    System.out.println("Vui lòng không để trống");
                }
                else {
                    age = Integer.parseInt(ageInput);
                    if (age < 0){
                        System.out.println("Vui lòng nhập số nguyên >= 0");
                    }else {
                        break;
                    }
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập số nguyên >= 0");
            }
        }
        System.out.print("Nhập điểm trung bình : ");
        while (true){
            try {
                String ageInput = scanner.nextLine();
                if (ageInput.isEmpty()){
                    System.out.println("Vui lòng không để trống");
                }
                else {
                    averageScore = Float.parseFloat(ageInput);
                    if (averageScore < 0){
                        System.out.println("Vui lòng nhập số thực >= 0");
                    }else {
                        break;
                    }
                }
            }catch (Exception e){
                System.out.println("Vui lòng nhập số thực >= 0");
            }
        }
    }
    @Override
    public String toString() {
        return " Tên : " + name + " , Tuổi : " + age + " , Điểm TB : " + averageScore + " ";
    }
}
