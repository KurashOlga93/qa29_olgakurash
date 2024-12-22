package Task1;

public class MainApp {

    public static void main(String[] args) {

        Product[] list = {

                new Product("iphone", 1200, false, Type.MOBILE),
                new Product("xiaomi", 900, false, Type.MOBILE),
                new Product("LTE", 700, true, Type.MOBILE),
                new Product("samsung", 3000, false, Type.TV),
                new Product("android", 800, true, Type.MOBILE),
                new Product("marshall", 550, true, Type.AUDIO),
                new Product("airpods", 600, false, Type.AUDIO),
                new Product("horizont", 4500, false, Type.TV),
        };

        boolean available = true;

        ProductReport report = new ProductReport();

        report.priceBytype(list, Type.TV);

        int count = report.productCountByType(list, Type.AUDIO);
        System.out.println("Count of available devices by type:  " + count);

    }
}