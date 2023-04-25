package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeHandle {
    public ArrayList<Employee> createListEmployee(Scanner scanner, ArrayList<Employee> employees) {
        try{
            System.out.print("Nhập số lượng nhân viên cần thêm: ");
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1) + ": ");
                System.out.print("-Tên nhân viên: ");
                String name = scanner.nextLine();
                System.out.print("-Lương cơ bản: ");
                double salary = Double.parseDouble(scanner.nextLine());
                System.out.println("-Chức vụ: ");
                System.out.println("1. Nhân viên hành chính\t2. Nhân viên tiếp thị\t3. Trưởng phòng");
                int select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        employees.add(new Administrative(name, salary));
                        break;
                    case 2:
                        System.out.print("-Doanh số bán hàng: ");
                        double revenue = Double.parseDouble(scanner.nextLine());
                        System.out.print("-Tỉ lệ hoa hồng: ");
                        double bonus = Double.parseDouble(scanner.nextLine());
                        employees.add(new MarketingStaff(name, salary, revenue, bonus));
                        break;
                    case 3:
                        System.out.print("-Lương trách nhiệm: ");
                        double salaryResponsibility = Double.parseDouble(scanner.nextLine());
                        employees.add(new Manager(name, salary, salaryResponsibility));
                        break;
                }
            }
        } catch (NumberFormatException ex){
            System.out.println("Nhập sai định dạng. Yêu cầu nhập lại");
        }
        return employees;
    }

    public void displayAllEmployee(ArrayList<Employee> employees) {
        boolean check = false;
        for (Employee employee : employees
        ) {
            System.out.println(employee);
            check = true;
        }
        if(!check) System.out.println("Danh sách nhân viên trống.");
    }

    public Employee findById(Scanner scanner, ArrayList<Employee> employees) {
        System.out.println("Bạn muốn tìm nhân viên có ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employees
        ) {
            if (employee.getId() == id) return employee;
        }
        return null;
    }

    public Employee editName(Employee employee, String name) {
        employee.setName(name);
        return employee;
    }


    public Administrative editSalary(Administrative administrative, Scanner scanner) {
        System.out.print("Lương cơ bản: ");
        double salary = Double.parseDouble(scanner.nextLine());
        administrative.setSalary(salary);
        return administrative;
    }

    public Manager editSalary(Manager manager, Scanner scanner) {
        System.out.print("Lương cơ bản: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Lương trách nhiệm: ");
        double salaryResponsibility = Double.parseDouble(scanner.nextLine());
        manager.setSalary(salary);
        manager.setSalaryResponsibility(salaryResponsibility);
        return manager;
    }

    public MarketingStaff editSalary(MarketingStaff marketingStaff, Scanner scanner) {
        System.out.print("Lương cơ bản: ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Doanh số bán hàng: ");
        double revenue = Double.parseDouble(scanner.nextLine());
        System.out.print("Tỉ lệ hoa hồng: ");
        double bonus = Double.parseDouble(scanner.nextLine());
        marketingStaff.setSalary(salary);
        marketingStaff.setRevenue(revenue);
        marketingStaff.setBonus(bonus);
        return marketingStaff;
    }

    public void findBySalary(Scanner scanner, ArrayList<Employee> employees) {
        System.out.print("Bạn cần tìm nhân viên có mức lương dưới: ");
        double salary = Double.parseDouble(scanner.nextLine());
        for (Employee employee : employees
        ) {
            if (employee.caculateIncome() <= salary) {
                System.out.println(employee);
            }
        }
    }

    public ArrayList<Employee> sortByName(ArrayList<Employee> employees) {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return employees;
    }

    public ArrayList<Employee> sortBySalary(ArrayList<Employee> employees) {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.caculateIncome() - o2.caculateIncome());
            }
        });
        return employees;
    }
    public void displayTopSalary(ArrayList<Employee> employees){
        ArrayList<Employee> employees1 = sortBySalary(employees);
        for (int i = employees1.size(); i >= 0; i++) {
            if (i == employees1.size()-6) break;
            System.out.println(employees1.get(i));
        }
    }
}
