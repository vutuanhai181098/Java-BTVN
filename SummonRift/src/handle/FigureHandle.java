package handle;

import entity.Figure;

import java.util.Scanner;

public class FigureHandle {
    public Figure createFigure(Scanner scanner) {
        System.out.println("Nhập thông tin tướng:");
        System.out.print("-Tên: ");
        String name = scanner.nextLine();
        System.out.print("-Vai trò: ");
        String position = scanner.nextLine();
        Figure figure = new Figure(name, position);
        return figure;
    }
}
