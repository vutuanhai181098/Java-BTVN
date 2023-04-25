package model;

public class MarketingStaff extends Employee {

    private double revenue;
    private double bonus;

    public MarketingStaff(String name, double salary, double revenue, double bonus) {
        super(name, salary);
        this.revenue = revenue;
        this.bonus = bonus;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double caculateIncome() {
        return salary + (revenue * bonus);
    }

    @Override
    public double caculateVAT() {
        return super.caculateVAT();
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Tên: " + name + ", Lương cơ bản: " + salary + ", Doanh số: " + revenue + ", Tỉ lệ hoa hồng: " + bonus + ", Tổng thu nhập: " + caculateIncome() + ", Thuế: " + caculateVAT();
    }
}
