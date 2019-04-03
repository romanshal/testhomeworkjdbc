package by.courses.roma.java.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor(staticName = "of")
public class Products {

    private int id;

    private String productName;

    private int productCount;

    private int price;

    public Products() {
    }

    public Products(int id, String productName, int productCount, int price) {
        this.id = id;
        this.productName = productName;
        this.productCount = productCount;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productCount=" + productCount +
                ", price=" + price +
                '}';
    }
}
