public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
    public double perimeter(){
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có diện tích: " + area() +", chu vi: " + perimeter() + ", chiều dài: " + length + ", chiều rộng: " + width;
    }
}
