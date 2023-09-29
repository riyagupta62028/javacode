public class ProductInventory {
    public static void main(String[] args) {
        String[] products = { "Laptop", "Phone", "Tablet" };
        double[] prices = { 999.99, 499.99, 299.99 };
        int[] quantities = { 10, 20, 15 };

        System.out.println("Product Inventory:");
        System.out.println("----------------------------");

        for (int i = 0; i < products.length; i++) {
            String product = products[i];
            double price = prices[i];
            int quantity = quantities[i];

            System.out.println("Product: " + product);
            System.out.println("Price: $" + price);
            System.out.println("Quantity in stock: " + quantity);
            System.out.println("Total value: $" + (price * quantity));
            System.out.println("----------------------------");
        }
    }
}
