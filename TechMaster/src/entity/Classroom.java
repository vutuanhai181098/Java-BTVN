package entity;

import java.util.ArrayList;

public class Classroom {
    private String subject;
    private ArrayList<Student> students;

    public Classroom(String subject, ArrayList<Student> students) {
        this.subject = subject;
        this.students = students;
    }

    public String toString() {
        String string = "";
        for (Student stu : students
        ) {
            string += stu + "\n";
        }
        return "Môn học: " + subject + "\nHọc viên:\n" + string;
    }
}
