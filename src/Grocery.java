public class Grocery extends Product{
    private String expiryDate;

    public Grocery(String productId, String name, double price, int quantity, String expiryDate) {
        super(productId, name, price, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("-------------------------------");
    }
}
