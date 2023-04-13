package handle;

import entity.Figure;
import entity.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerHandle {
    public Player createPlayer(Scanner scanner) {
        System.out.println("Thông tin người chơi:");
        System.out.print("-Tên: ");
        String name = scanner.nextLine();
        System.out.print("-Tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        FigureHandle figureHandle = new FigureHandle();
        Player player = new Player(name, age, figureHandle.createFigure(scanner));
        return player;
    }
}
