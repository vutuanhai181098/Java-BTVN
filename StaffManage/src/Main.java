import controller.IndexControl;
import model.Employee;
import view.Index;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        Index index = new Index();
        IndexControl indexControl = new IndexControl();
        do {
            indexControl.indexControl(index.index(scanner), employees, scanner);
        } while (true);

    }
}