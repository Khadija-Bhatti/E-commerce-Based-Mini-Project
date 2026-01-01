public class Main {
    public static void main(String[] args) {
        Product p;
        p=new Electronics("E101","Laptop",85000,2,24);
        p.displayDetails();

        p = new Clothing("C202", "T-Shirt", 1200, 5, "Medium", "Cotton");
        p.displayDetails();

        p = new Grocery("G303", "Milk Pack", 180, 10, "10-12-2025");
        p.displayDetails();

        Buyer buyer = new Buyer("B001", "Ali", "ali@gmail.com", "Hyderabad");
        buyer.display();

        Seller seller = new Seller("S001", "Ahmed", "shop@gmail.com", "Tech World");
        seller.display();

        Grocery grocery= new Grocery("Kb410","Lawn Kurta",2000.00,1,"25-dec-2025");
        grocery.displayDetails();


    }

}
