import entity.Student;
import entity.TechMaster;
import handle.StudentHandle;
import handle.TechMasterHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        TechMasterHandle techMasterHandle = new TechMasterHandle();
        StudentHandle studentHandle = new StudentHandle();
        techMasterHandle.techMaster(scanner, students, studentHandle);
    }
}