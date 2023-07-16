package secondJava;
import java.util.ArrayList;
public class Contact {
    private String name;
    private String phonenumber;
    
    public Contact(String name, String phonenumber){
        this.name = name; 
        this.phonenumber = phonenumber;
    }
    
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phonenumber;
    }
    public void setPhoneNumber(String phonenumber){
        this.phonenumber = phonenumber;
    }
    
    @Override
    public String toString(){
        return "Name; "+ name + "Phonenumber " + phonenumber ; 
    }
    public static void main(String[] args) {
        Contact contact1 = new Contact("David","01224 888 666");
        Contact contact2 = new Contact("JCG","07567 777 333");
        Contact contact3 = new Contact("Peter","01345 999 333");
        
        ArrayList<Contact> mycontacts = new ArrayList();
            
        mycontacts.add(new Contact("Suzy","01224 555 777"));
mycontacts.add(new Contact("Yolanda","01224 123 567"));
        mycontacts.add(new Contact("Deek","01224 463 111"));
        
        mycontacts.add(contact1);
        
        for(Contact i : mycontacts)
        System.out.println(i);
        
        
    
}