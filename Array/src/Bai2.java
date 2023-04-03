import java.util.Scanner;

public class Bai2 {
    /*
    Câu 2: Viết chương trình thực hiện:
        Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím
        Nhập các phần tử mảng
        In mảng ra màn hình
        Thay đổi các phần tử là số chẵn trong mảng tăng lên 1
        VD: [1,4,7,6,2,3] -> [1,5,7,7,3,3]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượng phần tử: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Hiển thị các giá trị của mảng:");
        for (int i : array) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                array[i] += 1;
        }
        System.out.println("Hiển thị các giá trị của mảng sau khi đã thay đổi:");
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
