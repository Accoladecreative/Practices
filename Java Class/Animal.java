public class Animal{
   private int leg;
   private int eyes;
   private String color;
   private String name;
   
 
   
   public int getLeg(){
       return leg;
   }
   
   public void setLeg(int leg){
       this.leg = leg;
   }
   
   public int getEyes(){
       return eyes ;
   }
   public void setEyes(int eyes){
       this.eyes = eyes;
   } 
   
   public String getColor(){
       return color;
   }
   public void setColor(String color){
       this.color = color;
   } 
      
   public String toString(){
      return "Leg: " +leg +"Color : "+color;
   }
   
     //constructor functions
public Animal (int leg, int eyes, String color, String name){
    this.leg = leg;
    this.eyes = eyes;
    this.color = color;
    this.name = name ;
}
 public Animal (){
 }  
}

//Player neymar = new Player()
