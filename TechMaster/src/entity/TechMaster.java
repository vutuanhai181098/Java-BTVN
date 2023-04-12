package entity;

import handle.StudentHandle;

public class TechMaster {
    private Person manageClass;
    private Person teacher;
    private Classroom classroom;

    public TechMaster(Person manageClass, Person teacher, Classroom classroom) {
        this.manageClass = manageClass;
        this.teacher = teacher;
        this.classroom = classroom;
    }

    public String toString() {
        return "Thông tin trung tâm TechMaster:\n1. Người quản lý:\n" + manageClass.toString() +
                "\n2. Giảng viên:\n" + teacher.toString() + "\n3. Lớp học:\n" + classroom.toString();
    }
}
