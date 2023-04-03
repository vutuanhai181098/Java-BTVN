import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bạn muốn nhập thông tin về: 1. Bác sĩ \t 2. Bệnh nhân");
            System.out.print("Mời chọn (nhập 1 hoặc 2): ");
            int type = Integer.parseInt(scanner.nextLine());
            if (type != 1 && type != 2) {
                System.out.println("Nhập không đúng định dạng! Mời nhập lại.");
                continue;
            }
            System.out.print("Mời nhập tên: ");
            String name = scanner.nextLine();
            System.out.print("Mời nhập tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Mời nhập địa chỉ: ");
            String address = scanner.nextLine();
            if (type == 1) {
                System.out.print("Mời nhập chuyên khoa bác sĩ: ");
                String specialist = scanner.nextLine();
                System.out.print("Mời nhập số giờ làm việc: ");
                double timeForWork = Double.parseDouble(scanner.nextLine());
                Doctor doctor = new Doctor(name, age, address, specialist, timeForWork);
                System.out.println(doctor);
            } else {
                System.out.print("Mời nhập số bệnh án: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Mời nhập ngày nhập viện (dd/MM/yyyy): ");
                String date = scanner.nextLine();
                Patient patient = new Patient(name, age, address, id, date);
                System.out.println(patient);
            }
        } while (true);
    }
}
