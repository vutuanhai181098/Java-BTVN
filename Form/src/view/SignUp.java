package view;

import model.User;

import java.util.Scanner;

public class SignUp {
    public User viewSignUp(Scanner scanner){
        System.out.println("-----Sign Up-----");
        System.out.print("-Username: ");
        String username = scanner.nextLine();
        System.out.print("-Password: ");
        String password = scanner.nextLine();
        System.out.print("-Email: ");
        String email = scanner.nextLine();
        User user = new User(username, password, email);
        return user;
    }
}
