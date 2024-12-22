package lesson6.Task1;

public class ProductReport {

    public void priceBytype(Product[] list, Type tp) {

        for (Product product : list) {
            if (product.state == tp)
                System.out.println("List of products by type: " + product.name + " " + product.price);
        }
    }

    public int productCountByType(Product[] list, Type tp) {

        int count = 0;
        for (Product product : list) {
            if (product.state == tp && product.isAvailable)
                count++;
        }
        return count;
    }
}