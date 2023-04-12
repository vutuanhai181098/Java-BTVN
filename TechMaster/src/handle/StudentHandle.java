package handle;

import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandle {
    public ArrayList<Student> createListStudent(Scanner scanner, ArrayList<Student> students){
        System.out.print("Nhập số lượng học viên thêm vào trung tâm: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < quantity; i++) {
            System.out.println("Nhập thông tin cho thành viên thứ " +(i+1) +":");
            System.out.print("Họ và tên: ");
            String name = scanner.nextLine();
            System.out.print("Tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Học lực: ");
            String capacity = scanner.nextLine();
            Student student = new Student(name, age, capacity);
            students.add(student);
        }
        return students;
    }
    public Student findByID(Scanner scanner, ArrayList<Student> students){
        boolean check = false;
        System.out.println("Nhập ID học viên cần tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student:students
             ) {
            if(id == student.getId()){
                check = true;
                return student;
            }
        }
        if(!check) System.out.println("Không tìm thấy học viên có ID " + id);
        return null;
    }
    public Student updateByCapacity(ArrayList<Student> students, Scanner scanner){
        Student student = findByID(scanner,students);
        System.out.print("Nhập học lực mới: ");
        String capacity = scanner.nextLine();
        student.setCapacity(capacity);
        return student;
    }
}
