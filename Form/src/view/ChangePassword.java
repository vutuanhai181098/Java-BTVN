package view;

import controller.UserControl;
import model.User;

import java.util.Scanner;

public class ChangePassword {
    public void viewChangePassword(Scanner scanner, User user){
        System.out.println("-----Change Password-----");
        System.out.println("-Old password: ");
        String oldPassword = scanner.nextLine();
        UserControl userControl = new UserControl();
        if (userControl.checkPassword(user, oldPassword) == null){
            System.out.println("Wrong password.");
            viewChangePassword(scanner, user);
        } else {
            System.out.println("-New password: ");
            String newPassword = scanner.nextLine();
            
        }

    }
}
