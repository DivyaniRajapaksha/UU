/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

/**
 *
 * @author Ruvini
 */
public class FoodItem {
    private String fId;
    private String name;
    private String description;
    private float price;
    private String image;
    private String catId;
    

    
    public FoodItem(String fId,String name,String description,float price,String image,String catId){
        this.fId=fId;
        this.name=name;
        this.description=description;
        this.price=price;
        this.image=image;
        this.catId=catId;
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

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the catId
     */
    public String getCatId() {
        return catId;
    }

    /**
     * @param catId the catId to set
     */
    public void setCatId(String catId) {
        this.catId = catId;
    }
    
  
    
    
}
