package view;

import model.Account;

import java.util.Scanner;

public class Index {
    public Account createAccount(Scanner scanner) {
        System.out.println("Enter information account:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Account Balance: ");
        double accountBalance = Double.parseDouble(scanner.nextLine());
        return new Account(name, accountNumber, email, accountBalance);
    }

    public void menu(Scanner scanner) {
        try {
            Account account = createAccount(scanner);
            do {
                System.out.println("=====Function=====");
                System.out.println("1. Recharge");
                System.out.println("2. Change Email");
                System.out.println("3. Display Information");
                System.out.println("4. Exit");
                System.out.println("Please choose!");
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1:
                        System.out.print("The amount: ");
                        account.setAccountBalance(account.getAccountBalance() + Double.parseDouble(scanner.nextLine()));
                        System.out.println("Successful!");
                        break;
                    case 2:
                        System.out.print("New email: ");
                        account.setEmail(scanner.nextLine());
                        System.out.println("Successful!");
                        break;
                    case 3:
                        account.displayInfo();
                        break;
                    case 4:
                        System.out.println("Goodbye!");
                        return;
                }
            } while (true);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong data format!");
        } finally {
            System.out.println("----------------------------------");
        }

    }
}
