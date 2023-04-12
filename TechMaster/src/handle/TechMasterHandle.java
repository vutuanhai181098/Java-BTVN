package handle;

import entity.Classroom;
import entity.Person;
import entity.Student;
import entity.TechMaster;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class TechMasterHandle {
    public TechMaster createTechMaster(Scanner scanner, ArrayList<Student> students){
        System.out.println("1. Nhập thông tin cho người quản lý: ");
        PersonHandle personHandle = new PersonHandle();
        Person manageClass = personHandle.createPerson(scanner);
        System.out.println("2. Nhập thông tin cho giảng viên: ");
        Person teacher = personHandle.createPerson(scanner);
        System.out.println("3. Nhập thông tin cho lớp học: ");
        ClassroomHandle classroomHandle = new ClassroomHandle();
        TechMaster techMaster = new TechMaster(manageClass, teacher, classroomHandle.createClassroom(scanner, students));
        return techMaster;
    }
    public void techMaster(Scanner scanner, ArrayList<Student> students, StudentHandle studentHandle) {
        TechMaster techMaster = createTechMaster(scanner, students);
        do {
            try{
                Menu menu = new Menu();
                int select = menu.menu(scanner);
                switch (select){
                    case 1:
                        System.out.println(techMaster);
                        break;
                    case 2:
                        studentHandle.createListStudent(scanner, students);
                        System.out.println("Đã thêm thành công.");
                        break;
                    case 3:
                        studentHandle.updateByCapacity(students, scanner);
                        System.out.println("Cập nhập thành công.");
                        break;
                    case 4:
                        students.remove(studentHandle.findByID(scanner, students));
                        System.out.println("Đã xóa thành công.");
                        break;
                    case 5:
                        System.out.println("Tạm biệt!");
                        return;
                }
            }catch (NumberFormatException ex){
                System.out.println("Nhập sai định dạng!");
            }finally {
                System.out.println("----------------------------------");
            }
        }while (true);
    }
}
