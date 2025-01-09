package lesson10;

import java.util.ArrayList;
import java.util.List;

public class ProductReport {

    public String productByName(List<Product> products, String name) {

        for (Product product : products) {

            if (product.getName().equals(name))

                return product.getName();
        }
        return "Not found";

    }

    public List<Product> productByPrice(List<Product> products, int price) {
        List<Product> newList = new ArrayList<>();

        for (Product product : products) {

            if (product.getPrice() > price)
                newList.add(product);
        }
        return newList;

    }

    public int totalAmount(List<Product> products) {
        int total = 0;
        for (Product product : products) {
            total += product.getCount();
        }
        return total;
    }

}