package secondJava;

public class Item {
    private int numberUnits;
    private final Product product;
    
    public Item(int numberUnits, String name, double unitCost){
        this.numberUnits = numberUnits;
        this.product = new Product(name,unitCost);
      }
    public Item(int numberUnits, Product product){
        this.numberUnits = numberUnits;
        this.product = product; 
    }
    public Item(Product product){
        this.numberUnits = 1;
        this.product = product;
    }

    public int
getNumberUnits() {
        return numberUnits;
    }

    public void setNumberUnits(int numberUnits) {
        this.numberUnits = numberUnits;
    }
    public Product getProduct(){
        return product;
    }
    // public double getCost(){
         //return Cost;
   //  }
    public double getCost() {
        return product.getCost(numberUnits);
    }
    
    @Override
    public String toString(){
        String pp = "Product name: "+ product.getName();
        String nu = "; Number of Unit: "+ numberUnits;
        String cc = "; Cost: "+ getCost();
        return pp+nu+cc;
    }
    
    public static void main(String[] args) {
     // System.out.print(new Item(2, "goods",12.6)) ; 
        Product product9 = new Product("Banana", 30.2);
        Item item1 = new Item(5, "Coke",200);
        Item item2 = new Item(20,product9);
        Item item3 = new Item(product9);
        
        
        Product pro = item2.getProduct();
       System.out.print("Name: "+ pro.getName());
        System.out.print("\nCost: " +pro.getCost(20));
        System.out.print("\nCost: " +item2.getCost());
        
        System.out.print("\n\nItem 2: " +item2);
             System.out.print("\n\nItem 1: " +item1);
        
        
    }
}