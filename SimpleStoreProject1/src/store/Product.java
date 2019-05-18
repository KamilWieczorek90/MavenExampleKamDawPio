package store;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String code;
    //int code = ThreadLocalRandom.current().nextInt(54000, 54099);
    private String name;
    private double price;
    private double discountPrice;

    public Product(String code, String name, double price, double discount) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.discountPrice = discount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return name  + ", cena = " + price+"zł" + " KOD: " + code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 &&
                Double.compare(product.getDiscountPrice(), getDiscountPrice()) == 0 &&
                Objects.equals(getCode(), product.getCode()) &&
                Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getName(), getPrice(), getDiscountPrice());
    }

    @Override
    public int compareTo(Product o) {
        return this.code.compareTo(o.code);
    }

}
