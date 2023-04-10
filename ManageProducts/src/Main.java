import entity.Product;
import handle.ProductHandle;
import view.Index;


import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Index index = new Index();
        ProductHandle productHandle = new ProductHandle();
        ArrayList<Product> productArrayList = new ArrayList<Product>();
        index.index(scanner, productHandle, productArrayList);
    }
}