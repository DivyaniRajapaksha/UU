/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ruvini
 */
public class Cart {

    /**
     * @return the al
     */
    public static ArrayList<Cart> getAl() {
        return al;
    }

    /**
     * @param aAl the al to set
     */
    public static void setAl(ArrayList<Cart> aAl) {
        al = aAl;
    }
    private String fId;
    private String name;
    private double price;
    private int quantity;
    private double totPrice;
    
    private static ArrayList<Cart> al=new ArrayList<Cart>(); 
    public Cart(){
        
    }
    
    public Cart(String fId,String name,double price,int quantity){
        this.fId=fId;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
        this.totPrice=(this.price)*(this.quantity);
        //System.err.println(this.totPrice);
    }
    
    
      public void addToCart(Cart c1){
         getAl().add(c1);
         
         
    }
      public ArrayList<Cart> retrieveCart(){
          /*Iterator itr=al.iterator();  
        
            while(itr.hasNext()){  
                  //System.out.println("called");
                Cart c1=(Cart)itr.next();  
                System.out.println(c1.name+" "+c1.price+" "+c1.quantity+" "+c1.totPrice+" ");  
            } */
          return getAl();
      }

    /**
     * @return the fId
     */
    public String getfId() {
        return fId;
    }

    /**
     * @param fId the fId to set
     */
    public void setfId(String fId) {
        this.fId = fId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the totPrice
     */
    public double getTotPrice() {
        return totPrice;
    }

    /**
     * @param totPrice the totPrice to set
     */
    public void setTotPrice(double totPrice) {
        this.totPrice = totPrice;
    }
}
