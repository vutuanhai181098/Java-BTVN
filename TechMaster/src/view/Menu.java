package view;

import java.util.Scanner;

public class Menu {
    public int menu(Scanner scanner){
        System.out.println("1. Hiển thị thông tin chi tiết của trung tâm.");
        System.out.println("2. Thêm học viên.");
        System.out.println("3. Cập nhật thông tin học viên.");
        System.out.println("4. Xóa học viên.");
        System.out.println("5. Thoát.");
        System.out.print("Mời bạn chọn chức năng: ");
        int select = Integer.parseInt(scanner.nextLine());
        return select;
    }
}
