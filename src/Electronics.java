public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String productId, String name, double price, int quantity, int warrantyMonths) {
        super(productId, name, price, quantity);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
            System.out.println("Warranty (months): " + warrantyMonths);
            System.out.println("-------------------------------");
        }
    }







