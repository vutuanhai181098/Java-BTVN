import Entity.Student;
import Handle.StudentHandle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.print("Mời bạn nhập số lượng sinh viên cần điền thông tin: ");
                int n = Integer.parseInt(scanner.nextLine());

                Student[] students = new Student[n];
                StudentHandle studentHandle = new StudentHandle();

                for (int i = 0; i < n; i++) {
                    System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + " : ");
                    Student student = studentHandle.createStudent(scanner);
                    students[i] = student;
                    System.out.println("");
                }

                System.out.println("Thông tin của các sinh viên: ");
                System.out.println(studentHandle.printAllStudent(students));
                System.out.println(studentHandle.percentage(students));
            } catch (NumberFormatException ex) {
                System.out.println("Nhập sai định dạng dữ liệu!");
            } finally {
                System.out.println("-------------------------------------");
            }
        } while (true);
    }
}