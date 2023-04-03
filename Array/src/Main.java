import java.util.Scanner;

public class Main {
/* Câu 1: Viết chương trình thực hiện công việc:
    Nhập vào từ bàn phím họ và tên bạn
    Thực hiện chuẩn hóa chuỗi vừa nhập.
    Ví dụ: lục thanh ngọc -> Lục Thanh Ngọc
    Gợi ý: sử dụng phương thức split() để cắt chuỗi
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đầy đủ họ và tên của bạn: ");
        String fullName = scanner.nextLine();
        String[] array = fullName.split(" ");
        String name = "";
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals("")) {
                String firstChar = array[i].substring(0, 1).toUpperCase();
                array[i] = firstChar + array[i].substring(1).toLowerCase();
                name = name + array[i] + " ";
            }
        }
        System.out.println(name.trim());

        /*Sử dụng StringBuilder:
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals("")) {
                String firstChar = array[i].substring(0, 1).toUpperCase();
                array[i] = firstChar + array[i].substring(1).toLowerCase();
                stringBuilder.append(array[i]).append(" ");
            }
        }
        System.out.println(stringBuilder.toString().trim());
        */
    }
}