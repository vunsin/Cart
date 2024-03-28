import java.util.HashMap;
import java.util.Map;

class Cart {
    private Map<Product, Integer> items;

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(Product product, int quantity) {
        int currentQuantity = items.getOrDefault(product, 0);
        if (currentQuantity <= quantity) {
            items.remove(product);
        } else {
            items.put(product, currentQuantity - quantity);
        }
    }

    public void showItems() {
        System.out.println("장바구니에 담긴 상품들:");
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey().getName() + " : " + entry.getValue() + "개");
        }
    }
}
