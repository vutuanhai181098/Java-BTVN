package model;

public class Administrative extends Employee {
    public Administrative(String name, double salary) {
        super(name, salary);
    }


    @Override
    public double caculateIncome() {
        return salary;
    }

    @Override
    public double caculateVAT() {
        return super.caculateVAT();
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Tên: " + name + ", Lương cơ bản: " + salary + ", Tổng thu nhập: " + caculateIncome() + ", Thuế: " + caculateVAT();
    }
}
