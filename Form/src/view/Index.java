package view;

import java.util.Scanner;

public class Index {
    public void viewIndex(Scanner scanner){
        System.out.println("=====Welcome=====");
        System.out.println("1. Sign In");
        System.out.println("2. Sign Up");
        System.out.println("Please choose!");
        int select = Integer.parseInt(scanner.nextLine());
    }
}
