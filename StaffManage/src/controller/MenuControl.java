package controller;

import model.Administrative;
import model.Employee;
import model.Manager;
import model.MarketingStaff;
import view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuControl {
    EmployeeHandle employeeHandle = new EmployeeHandle();

    public void menuControl(int select, Scanner scanner, ArrayList<Employee> employees) {
        switch (select) {
            case 1:
                employeeHandle.createListEmployee(scanner, employees);
                System.out.println("Thêm nhân viên thành công!");
                break;
            case 2:
                Employee employee1 = employeeHandle.findById(scanner, employees);
                System.out.println(employee1);
                subMenuControl(scanner, employee1);
                System.out.println("Thay đổi thành công!");
                break;
            case 3:
                employees.remove(employeeHandle.findById(scanner, employees));
                System.out.println("Đã xóa thành công!");
                break;
        }
    }

    public void subMenuControl(Scanner scanner, Employee employee) {
        Menu menu = new Menu();
        int select = menu.subMenu(scanner);
        switch (select) {
            case 1:
                System.out.print("Tên mới: ");
                String name = scanner.nextLine();
                employeeHandle.editName(employee, name);
                break;
            case 2:
                if (employee instanceof Administrative) {
                    Administrative administrative = (Administrative) employee;
                    employeeHandle.editSalary(administrative, scanner);
                } else if (employee instanceof MarketingStaff) {
                    MarketingStaff marketingStaff = (MarketingStaff) employee;
                    employeeHandle.editSalary(marketingStaff, scanner);
                } else {
                    Manager manager = (Manager) employee;
                    employeeHandle.editSalary(manager, scanner);
                }
                break;
        }
    }
}
