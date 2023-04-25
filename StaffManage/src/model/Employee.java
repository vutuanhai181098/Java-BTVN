package model;

public abstract class Employee {
    protected static int autoId;
    protected int id;
    protected String name;

    protected double salary;


    public Employee(String name, double salary) {
        this.id = ++autoId;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double caculateIncome();

    public double caculateVAT() {
        return caculateIncome() < 11000000 ? 0 : 0.1 * (caculateIncome() - salary);
    }

}
