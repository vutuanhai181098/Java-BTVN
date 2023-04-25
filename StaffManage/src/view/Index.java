package view;

import java.util.Scanner;

public class Index {
    public int index(Scanner scanner){
        System.out.println("=====Rồng Việt=====");
        System.out.println("1. Danh sách nhân viên.");
        System.out.println("2. Quản lý nhân viên.");
        System.out.println("3. Tìm kiếm nhân viên theo lương.");
        System.out.println("4. Sắp xếp nhân viên theo họ tên và thu nhập.");
        System.out.println("5. Top 5 nhân viên có thu nhập cao nhất công ty.");
        System.out.println("0. Thoát.");
        System.out.print("Mời chọn chức năng: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
