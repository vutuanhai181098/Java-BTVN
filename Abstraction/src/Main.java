import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhập thông tin cho sinh viên TechMaster: 1. Sinh viên IT \t 2. Sinh viên Biz");
                System.out.print("Mời nhập (nhập 1 hoặc 2): ");
                int type = Integer.parseInt(scanner.nextLine());
                if (type != 1 && type != 2) {
                    System.out.println("Nhập sai dữ liệu. Yêu cầu nhập 1 hoặc 2!");
                    continue;
                }
                System.out.print("Nhập họ và tên: ");
                String fullName = scanner.nextLine();
                System.out.print("Nhập chuyên ngành: ");
                String major = scanner.nextLine();
                switch (type) {
                    case 1:
                        System.out.print("Nhập điểm Java: ");
                        double pointJava = Double.parseDouble(scanner.nextLine());
                        System.out.print("Nhập điểm HTML: ");
                        double pointHtml = Double.parseDouble(scanner.nextLine());
                        System.out.print("Nhập điểm Css: ");
                        double pointCss = Double.parseDouble(scanner.nextLine());
                        SinhVienIT sinhVienIT = new SinhVienIT(fullName, major, pointJava, pointHtml, pointCss);
                        sinhVienIT.getTitle(sinhVienIT.getPoint());
                        System.out.println(sinhVienIT.print());
                        break;
                    case 2:
                        System.out.print("Nhập điểm Marketing: ");
                        double pointMarketing = Double.parseDouble(scanner.nextLine());
                        System.out.print("Nhập điểm Sales: ");
                        double pointSales = Double.parseDouble(scanner.nextLine());
                        SinhVienBiz sinhVienBiz = new SinhVienBiz(fullName, major, pointMarketing, pointSales);
                        sinhVienBiz.getTitle(sinhVienBiz.getPoint());
                        System.out.println(sinhVienBiz.print());
                        break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Nhập sai định dạng dữ liệu. Yêu cầu nhập 1 hoặc 2!");
            } finally {
                System.out.println("--------------------------");
            }
        } while (true);
    }
}