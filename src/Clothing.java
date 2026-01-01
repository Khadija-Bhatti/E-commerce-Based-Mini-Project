public class Clothing extends Product {
    private String size;
    private String fabric;

    public Clothing(String productId,String name,double price,int quantity,String size,String fabric){
        super(productId, name, price, quantity);
        this.fabric=fabric;
        this.size=size;

    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: "+size);
        System.out.println("Fabric: "+fabric);
        System.out.println("----------------------------------------");

    }
}
