package by.courses.roma.java.entity;

public class Shop {

    private String company;

    private int product;

    public Shop() {
    }

    public Shop(String company, int product) {
        this.company = company;
        this.product = product;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "company='" + company + '\'' +
                ", product=" + product +
                '}';
    }
}
