import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        Product milk = new Product("1", "우유", 2000);
        Product tissue = new Product("2", "화장지", 1000);
        productSet.add(milk);
        productSet.add(tissue);

        //상품목록확인
        System.out.println("고유한 상품 목록 :");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        //장바구니 생성
        Cart myCart = new Cart();

        //상품을 장바구니에 추가
        myCart.addProduct(milk, 2);
        myCart.addProduct(tissue, 3);

        //상품을 장바구니에서 제거
        myCart.removeProduct(milk, 1);

        //장바구니에 현재 담긴 상품들을 출력(상품이름, 갯수)
        myCart.showItems();
    }
}
