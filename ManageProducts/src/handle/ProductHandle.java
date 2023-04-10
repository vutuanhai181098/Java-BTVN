package handle;

import entity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductHandle {

    public ArrayList<Product> createListProduct(Scanner scanner, ArrayList<Product> productArrayList) {
        System.out.print("Nhập số lượng sản phẩm bạn muốn thêm: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            System.out.print("1. Tên sản phẩm: ");
            String nameProduct = scanner.nextLine();
            System.out.print("2. Mô tả sản phẩm: ");
            String describeProduct = scanner.nextLine();
            System.out.print("4. Số lượng: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("5. Giá bán: ");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.print("6. Đơn vị tính: ");
            String unit = scanner.nextLine();
            Product product = new Product(nameProduct, describeProduct, quantity, price, unit);
            productArrayList.add(product);
        }
        return productArrayList;
    }

    public void displayAllProduct(ArrayList<Product> productArrayList) {
        boolean check = false;
        for (Product product : productArrayList) {
            check = true;
            System.out.println(product);
        }
        if (!check) System.out.println("Danh sách sản phẩm trống.");
    }

    public void findByName(ArrayList<Product> productArrayList, String name) {
        boolean check = false;
        for (Product product : productArrayList) {
            if (product.getNameProduct().equalsIgnoreCase(name)) {
                check = true;
                System.out.println(product);
            }
        }
        if (!check) System.out.println("Không tìm thấy sản phẩm có tên: " + name);
    }

    public Product findById(ArrayList<Product> productArrayList, int id) {
        boolean check = false;
        for (Product product : productArrayList) {
            if (product.getId() == id) {
                check = true;
                return product;
            }
        }
        if (!check) System.out.println("Không tìm thấy sản phẩm có id: " + id);
        return null;
    }

    public void findByQuantity(ArrayList<Product> productArrayList, int quantity) {
        boolean check = false;
        for (Product product : productArrayList
        ) {
            if (product.getQuantity() < quantity) {
                check = true;
                System.out.println(product);
            }
        }
        if (!check) System.out.println("Không tìm thấy sản phẩm có số lượng dưới: " + quantity);
    }

    public void findByPrice(ArrayList<Product> productArrayList, int select) {
        boolean check = false;
        for (Product product : productArrayList
        ) {
            if (product.getPrice() < 50000 && select == 1) {
                check = true;
                System.out.println(product);
            } else if (product.getPrice() >= 50000 && product.getPrice() < 100000 && select == 2) {
                check = true;
                System.out.println(product);
            } else if (product.getPrice() >= 100000 && select == 3) {
                check = true;
                System.out.println(product);
            }
        }
        if (!check) System.out.println("Không tìm thấy sản phẩm.");
    }

    public void editProduct(Product product, int select, Scanner scanner) {
        switch (select) {
            case 1:
                System.out.println("Nhập tên mới cho sản phẩm: ");
                product.setNameProduct(scanner.nextLine());
                break;
            case 2:
                System.out.println("Nhập mô tả mới cho sản phẩm: ");
                product.setDescribeProduct(scanner.nextLine());
                break;
            case 3:
                System.out.println("Nhập số lượng mới cho sản phẩm: ");
                product.setQuantity(Integer.parseInt(scanner.nextLine()));
                break;
            case 4:
                System.out.println("Nhập giá bán mới cho sản phẩm: ");
                product.setPrice(Integer.parseInt(scanner.nextLine()));
                break;
            case 5:
                System.out.println("Nhập đơn vị tính mới cho sản phẩm: ");
                product.setUnit(scanner.nextLine());
                break;
        }
    }

    public ArrayList<Product> sortByPrice(ArrayList<Product> productArrayList) {
        Product[] products = productArrayList.toArray(new Product[0]);
        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < products.length - 1; j++) {
                if (products[j].getPrice() > products[j + 1].getPrice()) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
        productArrayList.clear();
        for (int i = 0; i < products.length; i++) {
            productArrayList.add(products[i]);
        }
        return productArrayList;
    }
}
