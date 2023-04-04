import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    Tạo lớp hình học với các phương thức tính diện tích và chu vi.
    Tạo lớp hình chữ nhật gồm: length(chiều dài), width(chiều rộng) và lớp hình vuông gồm side(cạnh) kế thừa từ lớp hình học
    Thực hiện :
        Tính chu vi và diện tích 2 hình trên
        Hiển thị thông tin về các cạnh của 2 hình trên.
     */
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bạn muốn tính chu vi và diện tích của: 1. Hình vuông \t 2. Hình chữ nhật");
            System.out.print("Mời nhập (nhập 1 hoặc 2): ");
            int type = Integer.parseInt(scanner.nextLine());
            switch (type) {
                case 1:
                    System.out.print("Mời bạn nhập độ dài của cạnh: ");
                    double side = Double.parseDouble(scanner.nextLine());
                    Square square = new Square(side);
                    System.out.println(square);
                    break;
                case 2:
                    System.out.print("Mời nhập chiều dài: ");
                    double length = Double.parseDouble(scanner.nextLine());
                    System.out.print("Mời nhập chiều rộng: ");
                    double width = Double.parseDouble(scanner.nextLine());
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println(rectangle);
                    break;
                default:
                    System.out.println("Nhập sai định dạng. Mời nhập lại!");
            }
        } while (true);
    }
}