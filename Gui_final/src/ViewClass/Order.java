/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Ruvini
 */
public class Order {
    private int oId;
    private LocalDate date;
    private LocalTime time;
    private double totPrice;
     private String cId;
    
    public Order(){
        
    }
      public Order(int oId,LocalDate date,LocalTime time,double totPrice){
        this.date=date;
        this.time=time;
        this.totPrice=totPrice;
    }
    public Order(int oId,double totPrice){
        this.oId=oId;
        this.totPrice=totPrice;
    }

    /**
     * @return the oId
     */
    public int getoId() {
        return oId;
    }

    /**
     * @param oId the oId to set
     */
    public void setoId(int oId) {
        this.oId = oId;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public LocalTime getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(LocalTime time) {
        this.time = time;
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

    /**
     * @return the cId
     */
    public String getcId() {
        return cId;
    }

    /**
     * @param cId the cId to set
     */
    public void setcId(String cId) {
        this.cId = cId;
    }
      
}
