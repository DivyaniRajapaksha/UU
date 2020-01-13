/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

import java.io.FileInputStream;
import java.sql.Blob;

/**
 *
 * @author Ruvini
 */
public class FoodItem {
    private String fId;
    private String name;
    private String description;
    private double price;
    private FileInputStream image;
    private int catId;
    private String filenamed;
    private  byte[] image1;
    
    public FoodItem(){
        
    }
    
    public FoodItem(String fId,String name,String description,double price,int catId,FileInputStream image){
        this.fId=fId;
        this.name=name;
        this.description=description;
        this.price=price;
        this.image=image;
        this.catId=catId;
        this.filenamed=filenamed;
    }
      public FoodItem(String fId,String name,String description,double price,int catId, byte[] image){
        this.fId=fId;
        this.name=name;
        this.description=description;
        this.price=price;
        this.image1=image;
        this.catId=catId;
        this.filenamed=filenamed;
    }
    public FoodItem(String fId,String name,String description,double price,int catId){
        this.fId=fId;
        this.name=name;
        this.description=description;
        this.price=price;
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
   

    /**
     * @param price the price to set
     */
    

    /**
     * @return the image
     */
   

    /**
     * @return the catId
     */
    public int getCatId() {
        return catId;
    }

    /**
     * @param catId the catId to set
     */
    public void setCatId(int catId) {
        this.catId = catId;
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
     * @return the image
     */
    public FileInputStream getMyImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(FileInputStream image) {
        this.image = image;
    }

    /**
     * @return the filenamed
     */
    public String getFilenamed() {
        return filenamed;
    }

    /**
     * @param filenamed the filenamed to set
     */
    public void setFilenamed(String filenamed) {
        this.filenamed = filenamed;
    }

    /**
     * @return the image1
     */
    public byte[] getImage1() {
        return image1;
    }

    /**
     * @param image1 the image1 to set
     */
    public void setImage1(byte[] image1) {
        this.image1 = image1;
    }
    
  
    
    
}
