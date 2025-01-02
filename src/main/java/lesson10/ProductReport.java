package lesson10;

import java.util.List;

public class ProductReport {

        public void productByName (List <Product> products, String name){

            for (Product product : products) {

                if (product.getName().equals(name))
                    System.out.println("Found product by name: " + product.getName());
            }

        }

        public void productByPrice (List < Product > products, int price){

            for (Product product : products) {

                if (product.getPrice() > price)
                    System.out.println("Found product by price: " + product.getName() + " - " + product.getPrice());
            }
        }

        public void totalAmount (List<Product> products) {
            int total = 0;
            for (Product product : products) {
                total += product.getCount();
            }
            System.out.println("Total amount of products: " + total);
        }

    }