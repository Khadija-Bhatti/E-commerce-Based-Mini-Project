public class Buyer extends Customer{
    private String deliveryAddress;

    public Buyer(String id, String name, String email, String deliveryAddress) {
        super(id, name, email);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("-------------------------------");
    }

}
