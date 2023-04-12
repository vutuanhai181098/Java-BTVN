package handle;

import entity.Classroom;
import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomHandle {
    public Classroom createClassroom(Scanner scanner, ArrayList<Student> students){
        System.out.println("Nhập tên môn học: ");
        String subject = scanner.nextLine();
        System.out.println("Nhập thông tin học viên: ");
        StudentHandle studentHandle = new StudentHandle();
        Classroom classroom = new Classroom(subject, studentHandle.createListStudent(scanner, students));
        return classroom;
    }

}
