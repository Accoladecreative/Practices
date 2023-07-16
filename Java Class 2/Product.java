package secondJava;
import java.util.ArrayList;

public class Product {
    private String name;
    private double unitCost;
    
    public Product(String name,double unitCost){
        this.name = name;
        this.unitCost = unitCost;
    }
    
    public String getName(){
      return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getUnitCost(){
      return unitCost;
    }
    
    public void setUnitCost(double cost){
        this.unitCost= cost;
    }
    
public double getCost(int number) {
        return this.unitCost * number;
    }
    
    @Override
    public String toString(){
        return "Name: "+ name+ "\nCost: "+unitCost+"\n";
    }
  
    public static void main(String[] args) {
        Product product1 = new Product("iPhone 14",500.00	);
        Product product2 = new Product("Samsung A10",400	);
        Product product3 = new Product("iPhone 11",15.5	);
        //System.out.println("Old Product 2: "+ product2.getName());
        product2.setName("Samsung A12");
       // System.out.println("New Product 2: "+ product2.getName());
        //ArrayList allProduct
        ArrayList<Product> products = new ArrayList();
        products.add(product1);
        products.add(new Product("iPhone 11",15.5	));
        products.add(new Product("iPhone 6", 50));
 products.add(new Product("iPhone 7", 75));
 products.add(new Product("iPhone 10", 400));
        for(Product z : products){
            System.out.println(z);
        }
    }
}