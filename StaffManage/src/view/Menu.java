package view;

import java.util.Scanner;

public class Menu {
    public int menu(Scanner scanner) {
        System.out.println("- 1. Thêm nhân viên.");
        System.out.println("- 2. Sửa thông tin nhân viên.");
        System.out.println("- 3. Xóa nhân viên.");
        System.out.print("Mời chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public int subMenu(Scanner scanner){
        System.out.println("1. Sửa tên nhân viên");
        System.out.println("2. Sửa lương nhân viên");
        System.out.print("Mời chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
