public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }
    public double perimeter(){
        return side * 4;
    }

    @Override
    public String toString() {
        return "Hình vuông có diện tích: " + area() +", chu vi: " + perimeter() + ", độ dài cạnh: " + side;
    }
}
