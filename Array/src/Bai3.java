import java.util.Scanner;

public class Bai3 {
    /*
    Câu 3: Cho phép nhập số lượng mảng bất kỳ
        Tìm số lớn nhất trong mảng
        Tìm số nhỏ nhất trong mảng
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số lượn phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 0);
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập giá trị cho phần tử thứ " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (max < i) max = i;
            if (min > i) min = i;
        }
        System.out.println("Số lớn nhất trong mảng là " + max);
        System.out.println("Số nhỏ nhất trong mảng là " + min);
    }
}
