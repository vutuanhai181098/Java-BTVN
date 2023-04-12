package handle;

import entity.Person;

import java.util.Scanner;

public class PersonHandle {
    public Person createPerson(Scanner scanner){
        System.out.print("Tên: ");
        String name = scanner.nextLine();
        System.out.print("Tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        Person manageClass = new Person(name, age);
        return manageClass;
    }
}
