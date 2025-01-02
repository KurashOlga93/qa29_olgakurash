package lesson10.collection;

import lesson10.Product;
import lesson10.ProductReport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MainAppList {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Apples", 170, 6));

        list.add(new Product("Milk", 100, 5));

        list.add(new Product("Bread", 50, 20));

        list.add(new Product("Cookie", 180, 5));

        list.add(new Product("Chocolate", 250, 3));

        ProductReport pr = new ProductReport();

        pr.productByName(list, "Cookie");
        pr.productByPrice(list, 200);
        pr.totalAmount(list);

        int centerIndex = list.size() / 2;

        list.add(centerIndex, new Product("Water", 75, 7));

        System.out.println("Product list size is: " + list.size());

        Product lastAdded = new Product("Water", 75, 7);
        System.out.println("Is product list contains last added product with name " + lastAdded.getName() + "? " + list.contains(lastAdded));

        System.out.println("Reversed list of products: " + list.reversed());

        System.out.println("Products from first to last added: " + list.subList(0,3));

    }
}