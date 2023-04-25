package model;

public class Manager extends Employee {
    private double salaryResponsibility;

    public Manager(String name, double salary, double salaryResponsibility) {
        super(name, salary);
        this.salaryResponsibility = salaryResponsibility;
    }

    public double getSalaryResponsibility() {
        return salaryResponsibility;
    }

    public void setSalaryResponsibility(double salaryResponsibility) {
        this.salaryResponsibility = salaryResponsibility;
    }

    @Override
    public double caculateIncome() {
        return salary + salaryResponsibility;
    }

    @Override
    public double caculateVAT() {
        return super.caculateVAT();
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Tên: " + name + ", Lương cơ bản: " + salary + ", Lương trách nhiệm: " + salaryResponsibility + ", Tổng thu nhập: " + caculateIncome() + ", Thuế: " + caculateVAT();

    }
}
