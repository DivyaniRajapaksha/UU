/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

/**
 *
 * @author Acer
 */
public class Promotion {
    private String pId;
    private String fId;
    private String name;
    private double discount;
    private double new_price;
    private String description;
    
    public Promotion(){

    }
    
    

    
    public Promotion(String pId,String fId,String name,double discount,double new_price,String description){
        this.fId=fId;
        this.name=name;
        this.pId=pId;
        this.discount=discount;
        this.new_price=new_price;
        this.description=description;
    }
    
    public Promotion(String pId,String name,String description){
        this.name=name;
        this.pId=pId;

        this.description=description;
    }
    
    

    /**
     * @return the pId
     */
    public String getpId() {
        return pId;
    }

    /**
     * @param pId the pId to set
     */
    public void setpId(String pId) {
        this.pId = pId;
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
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the new_price
     */
    public double getNew_price() {
        return new_price;
    }

    /**
     * @param new_price the new_price to set
     */
    public void setNew_price(double new_price) {
        this.new_price = new_price;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

   
    
    
    
    
}
