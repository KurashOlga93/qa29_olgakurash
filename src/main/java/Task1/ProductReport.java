package Task1;

public class ProductReport {

    public void priceBytype(Product[] list, Type tp) {

        for (Product product : list) {
            if (product.state == tp)
                System.out.println("List of products by type: " + product.name + " " + product.price);
        }
    }

    int count = 0;

    public int productCountByType(Product[] list, Type tp) {
        for (Product product : list) {
            if (product.state == tp && product.isAvailable)
                count++;
        }
        return count;
    }
}