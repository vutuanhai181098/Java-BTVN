package view;

import entity.Product;
import handle.ProductHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Index {
    public void index(Scanner scanner, ProductHandle productHandle, ArrayList<Product> productArrayList) {
        do {
            try {
                System.out.println("Xin chào!");
                System.out.println("1. Danh sách sản phẩm.");
                System.out.println("2. Tìm kiếm sản phẩm.");
                System.out.println("3. Cập nhật sản phẩm.");
                System.out.println("4. Thoát.");
                System.out.print("Mời bạn chọn chức năng: ");
                int select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        productHandle.displayAllProduct(productArrayList);
                        break;
                    case 2:
                        findProduct(scanner, productHandle, productArrayList);
                        break;
                    case 3:
                        updateProduct(scanner, productHandle, productArrayList);
                        break;
                    case 4:
                        System.out.println("Tạm biệt.");
                        return;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Nhập sai định dạng!");
            } finally {
                System.out.println("------------------------------");
            }
        } while (true);
    }

    public void findProduct(Scanner scanner, ProductHandle productHandle, ArrayList<Product> productArrayList) {
        System.out.println("1. Tim kiếm theo tên.");
        System.out.println("2. Tim kiếm theo ID.");
        System.out.println("3. Tim kiếm theo số lượng.");
        System.out.println("4. Tim kiếm theo giá cả.");
        System.out.print("Mời bạn chọn: ");
        int select = Integer.parseInt(scanner.nextLine());
        switch (select) {
            case 1:
                System.out.print("Bạn cần tìm sản phẩm có tên: ");
                String nameProduct = scanner.nextLine();
                productHandle.findByName(productArrayList, nameProduct);
                break;
            case 2:
                System.out.print("Bạn cần tìm sản phẩm có Id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println(productHandle.findById(productArrayList, id));
                break;
            case 3:
                System.out.print("Bạn cần tìm sản phẩm có số lượng dưới: ");
                int quantity = Integer.parseInt(scanner.nextLine());
                productHandle.findByQuantity(productArrayList, quantity);
                break;
            case 4:
                findProductByPrice(scanner, productHandle, productArrayList);
                break;
        }
    }

    public void findProductByPrice(Scanner scanner, ProductHandle productHandle, ArrayList<Product> productArrayList) {
        System.out.println("1. Dưới 50000.");
        System.out.println("2. Trên 50000 và dưới 10000.");
        System.out.println("3. Từ 100000 trở lên.");
        System.out.print("Mời bạn chọn: ");
        int select = Integer.parseInt(scanner.nextLine());
        productHandle.findByPrice(productArrayList, select);
    }

    public void updateProduct(Scanner scanner, ProductHandle productHandle, ArrayList<Product> productArrayList) {
        System.out.println("1. Thêm sản phẩm mới.");
        System.out.println("2. Thay đổi thông tin sản phẩm.");
        System.out.println("3. Xóa sản phẩm.");
        System.out.println("4. Sắp xếp theo giá sản phẩm.");
        System.out.print("Mời bạn chọn: ");
        int select = Integer.parseInt(scanner.nextLine());
        switch (select) {
            case 1:
                productHandle.createListProduct(scanner, productArrayList);
                System.out.println("Thêm sản phẩm mới thành công.");
                break;
            case 2:
                editProduct(scanner, productHandle, productArrayList);
                break;
            case 3:
                System.out.print("Mời bạn nhập Id sản phẩm cần tìm: ");
                Product product = productHandle.findById(productArrayList, Integer.parseInt(scanner.nextLine()));
                productArrayList.remove(product);
                System.out.println("Đã xóa thành công.");
                break;
            case 4:
                productHandle.displayAllProduct(productHandle.sortByPrice(productArrayList));
                break;
        }
    }

    public void editProduct(Scanner scanner, ProductHandle productHandle, ArrayList<Product> productArrayList) {
        System.out.print("Bạn cần tìm sản phẩm có Id: ");
        Product product = productHandle.findById(productArrayList, Integer.parseInt(scanner.nextLine()));
        System.out.println("Thông tin cần thay đổi: ");
        System.out.println("1. Tên\t2. Mô tả\t3. Số lượng\t4. Giá cả\t5. Đơn vị tính");
        System.out.print("Mời bạn chọn: ");
        productHandle.editProduct(product, Integer.parseInt(scanner.nextLine()), scanner);
        System.out.println("Thay đổi thành công!");
    }
}
