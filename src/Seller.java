public class Seller extends Customer{
    private String shopName;
    public Seller(String id,String name,String email,String shopName){
        super(id,name,email);
        this.shopName=shopName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Shop Name: "+shopName);
        System.out.println("---------------------------");
    }
}
