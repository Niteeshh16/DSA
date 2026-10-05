import java.util.*;

public class Solution {

    // ShoppingItem class
    static class ShoppingItem {
        String name;
        double price;
        boolean inStock;

        ShoppingItem(String name, double price, boolean inStock) {
            this.name = name;
            this.price = price;
            this.inStock = inStock;
        }

        String getItemDetails() {
            return name + " (Price: $" +
                    String.format("%.2f", price) +
                    ", In Stock: " + inStock + ")";
        }
    }

    // CartOperations interface
    interface CartOperations {

        String addItem(ShoppingItem item)
                throws OutOfStockException, CartSizeExceededException;

        String viewCart();

        String checkout() throws EmptyCartException;
    }

    // Out of stock exception
    static class OutOfStockException extends Exception {

        OutOfStockException(String itemName) {
            super("Cannot add item '" + itemName +
                    "' to the cart as it is out of stock.");
        }
    }

    // Cart size exception
    static class CartSizeExceededException extends Exception {

        CartSizeExceededException(int cartSize) {
            super("Cannot add item to the cart as it will exceed " +
                    "the maximum cart size of " + cartSize + ".");
        }
    }

    // Empty cart exception
    static class EmptyCartException extends Exception {

        EmptyCartException() {
            super("Cannot complete checkout as the cart is empty.");
        }
    }

    // ShoppingCart class
    static class ShoppingCart implements CartOperations {

        ArrayList<ShoppingItem> items;
        int maxCartSize;

        ShoppingCart(int maxCartSize) {
            this.maxCartSize = maxCartSize;
            this.items = new ArrayList<>();
        }

        @Override
        public String addItem(ShoppingItem item)
                throws OutOfStockException, CartSizeExceededException {

            if (!item.inStock) {
                throw new OutOfStockException(item.name);
            }

            if (items.size() >= maxCartSize) {
                throw new CartSizeExceededException(maxCartSize);
            }

            items.add(item);

            return item.name + " added successfully.";
        }

        @Override
        public String viewCart() {

            if (items.isEmpty()) {
                return "Cart is empty.";
            }

            StringBuilder result = new StringBuilder();

            result.append("Items in the cart:\n");

            double total = 0;

            for (ShoppingItem item : items) {
                result.append("* ")
                        .append(item.getItemDetails())
                        .append("\n");

                total += item.price;
            }

            result.append("Total cost: $")
                    .append(String.format("%.2f", total));

            return result.toString();
        }

        @Override
        public String checkout() throws EmptyCartException {

            if (items.isEmpty()) {
                throw new EmptyCartException();
            }

            items.clear();

            return "Checkout completed successfully.";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Maximum cart size
        int maxCartSize = Integer.parseInt(sc.nextLine().trim());

        // Number of items
        int n = Integer.parseInt(sc.nextLine().trim());

        ShoppingCart cart = new ShoppingCart(maxCartSize);

        // Read items
        for (int i = 0; i < n; i++) {

            String[] data = sc.nextLine().split(",");

            String name = data[0];
            double price = Double.parseDouble(data[1]);
            boolean inStock = Boolean.parseBoolean(data[2]);

            ShoppingItem item =
                    new ShoppingItem(name, price, inStock);

            try {
                System.out.println(cart.addItem(item));
            } catch (OutOfStockException e) {
                System.out.println(e.getMessage());
            } catch (CartSizeExceededException e) {
                System.out.println(e.getMessage());
            }
        }

        // Number of operations
        int operations = Integer.parseInt(sc.nextLine().trim());

        // Process operations
        for (int i = 0; i < operations; i++) {

            String operation = sc.nextLine().trim();

            if (operation.equals("viewCart")) {

                System.out.println(cart.viewCart());

            } else if (operation.equals("checkout")) {

                try {
                    System.out.println(cart.checkout());
                } catch (EmptyCartException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        sc.close();
    }
}