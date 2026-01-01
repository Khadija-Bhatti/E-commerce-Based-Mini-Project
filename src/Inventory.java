import java.util.HashMap;
public class Inventory {
    private HashMap<String, Product> products = new HashMap<>();

    public void addProduct(String sku,Product product){
        products.put(sku, product);
        System.out.println("Product added: "+sku);
    }

    public void updateQuantity(String sku,int newQty){
        if(products.containsKey(sku)){
            products.get(sku).setQuantity(newQty);
        }else{
            System.out.println("SKU not found!!");
        }
    }

    public void searchProduct(String sku) {
        if (products.containsKey(sku)) {
            products.get(sku).displayDetails();
        } else {
            System.out.println("Product not found!");
        }
    }

    public void displayAll() {
        for (String key : products.keySet()) {
            System.out.println("SKU: " + key);
            products.get(key).displayDetails();
        }
    }


}
