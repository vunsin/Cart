import java.util.*;

class Product {
    private String key;
    private String name;
    private int price;

    public Product(String key, String name, int price) {
        this.key = key;
        this.name = name;
        this.price = price;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Product product = (Product) obj;
        return Objects.equals(key, product.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
