package Handle;

import Entity.Student;

import java.util.Scanner;

public class StudentHandle {
    //    Enter student information
    public Student createStudent(Scanner scanner) {
        System.out.print("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.print("Điểm Toán: ");
        double scoreMath = Double.parseDouble(scanner.nextLine());
        System.out.print("Điểm Lý: ");
        double scorePhysic = Double.parseDouble(scanner.nextLine());
        System.out.print("Điểm Hóa: ");
        double scoreChemistry = Double.parseDouble(scanner.nextLine());
        Student student = new Student(name, scoreMath, scorePhysic, scoreChemistry);
        return student;
    }

    //    Average score
    public double scoreAvg(Student student) {
        double scoreAvg = (student.getScoreMath() + student.getScorePhysic() + student.getScoreChemistry()) / 3;
        return Math.ceil(scoreAvg * 100) / 100;
    }

    //  Classify
    public String classify(double scoreAvg) {
        if (scoreAvg >= 8 && scoreAvg <= 10) {
            return "A";
        } else if (scoreAvg < 8 && scoreAvg >= 6.5) {
            return "B";
        } else if (scoreAvg < 6.5 && scoreAvg >= 0) {
            return "C";
        } else {
            return "Nhập sai điểm. Yêu cầu kiểm tra lại!";
        }
    }

    //    Print information of student
    public String printStudent(Student student) {
        return "Số Id: " + student.getId() + ", Họ và tên: " + student.getName() +
                ", Điểm trung bình: " + scoreAvg(student) + ", Xếp loại: " + classify(scoreAvg(student)) + ".";
    }

    //  Print information of each student in the list student
    public String printAllStudent(Student[] students) {
        for (Student student : students
        ) {
            System.out.println(printStudent(student));
        }
        return "";
    }

    // Calculate percentage
    public String percentage(Student[] students) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (int i = 0; i < students.length; i++) {
            if (classify(scoreAvg(students[i])).equals("A"))
                countA++;
            else if (classify(scoreAvg(students[i])).equals("B"))
                countB++;
            else if (classify(scoreAvg(students[i])).equals("C"))
                countC++;
        }
        double percentageA = ((double) countA / students.length) * 100;
        double percentageB = ((double) countB / students.length) * 100;
        double percentageC = ((double) countC / students.length) * 100;
        return "Sinh viên xếp loại A có: " + (Math.ceil(percentageA * 100) / 100) + "%, xếp loại B: " + (Math.ceil(percentageB * 100) / 100) + "%, xếp loại C: " + (Math.ceil(percentageC * 100) / 100) + "%.";
    }
}
