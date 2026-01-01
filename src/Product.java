public class Product {
    private String productId;
    private String name;
    private double price;
    private int quantity;
    
    public Product(String productId,String name,double price,int quantity){
        this.productId=productId;
        this.name=name;
        setPrice(price);
        setQuantity(quantity);
    }
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setPrice(double price){
        if (price<0){
            System.out.println("price cant be negative");
        }else{
            this.price=price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Error: Quantity cannot be below 0!");
        } else {
            this.quantity = quantity;
        }
    }

    public double getTotalValue() {
        return price * quantity;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Value: " + getTotalValue());
    }
}



