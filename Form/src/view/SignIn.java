package view;

import controller.UserControl;
import model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class SignIn {
    public void viewSignIn(Scanner scanner, ArrayList<User> users){
        System.out.println("-----Sign In-----");
        System.out.print("-Username: ");
        String username = scanner.nextLine();
        UserControl userControl = new UserControl();
        User user = userControl.checkUsername(users, username);
        if(user == null){
            System.out.println("Wrong username.");
            SignIn signIn = new SignIn();
            signIn.viewSignIn(scanner, users);
        } else {
        System.out.print("-Password: ");
        String password = scanner.nextLine();
        userControl.checkPassword(user, password);
        if(user == null){
            System.out.println("Wrong password.");
            System.out.println("1. Re - Sign in");
            System.out.println("2. Forgot password");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    viewSignIn(scanner, users);
                    break;
                case 2:
                    System.out.println("-Email: ");
                    String email = scanner.nextLine();
                    userControl.checkEmail(user, email);
                    if (user == null){
                        System.out.println("Account does not exist.");
                        viewSignIn(scanner, users);
                    } else {

                    }
            }
        }
        }
    }
}
