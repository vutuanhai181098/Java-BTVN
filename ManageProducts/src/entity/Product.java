package entity;

public class Product {
    private static int autoId;
    private int id;
    private String nameProduct;
    private String describeProduct;
    private int quantity;
    private int price;
    private String unit;

    public int getId() {
        return id;
    }

    public Product() {
        this.id = ++autoId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescribeProduct() {
        return describeProduct;
    }

    public void setDescribeProduct(String describeProduct) {
        this.describeProduct = describeProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Product(String nameProduct, String describeProduct, int quantity, int price, String unit) {
        this.id = ++autoId;
        this.nameProduct = nameProduct;
        this.describeProduct = describeProduct;
        this.quantity = quantity;
        this.price = price;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Tên sản phẩm: " + nameProduct + ", Mô tả: " +
                describeProduct + ", Số lượng: " + quantity + ", Giá bán: " + price + unit + ".";
    }
}
