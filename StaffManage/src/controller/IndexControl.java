package controller;

import model.Employee;
import view.Menu;

import java.util.*;

public class IndexControl {
    public void indexControl(int select, ArrayList<Employee> employees, Scanner scanner) {
        EmployeeHandle employeeHandle = new EmployeeHandle();
        switch (select) {
            case 1:
                employeeHandle.displayAllEmployee(employees);
                break;
            case 2:
                Menu menu = new Menu();
                MenuControl menuControl = new MenuControl();
                menuControl.menuControl(menu.menu(scanner), scanner, employees);
                break;
            case 3:
                employeeHandle.findBySalary(scanner, employees);
                break;
            case 4:
                System.out.println("1. Sắp xếp theo tên\n2. Sắp xếp theo thu nhập");
                System.out.print("Mời chọn: ");
                switch (Integer.parseInt(scanner.nextLine())) {
                    case 1:
                        employeeHandle.displayAllEmployee(employeeHandle.sortByName(employees));
                        break;
                    case 2:
                        employeeHandle.displayAllEmployee(employeeHandle.sortBySalary(employees));
                        break;
                }
                break;
            case 5:
                employeeHandle.displayTopSalary(employees);
                break;
            case 0:
                return;
        }
    }
}
