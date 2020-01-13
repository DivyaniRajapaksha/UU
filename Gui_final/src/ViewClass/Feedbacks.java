/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

/**
 *
 * @author DIM
 */
public class Feedbacks {
    
    private String f_name;
    private String l_name;
    private String email;
    private String hear;
    private String feedback;
    
    
    public Feedbacks(String f_name,String l_name,String email,String hear,String feedback){
    
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.feedback = feedback;
        this.hear = hear;
    
    }

    /**
     * @return the f_name
     */
    public String getF_name() {
        return f_name;
    }

    /**
     * @param f_name the f_name to set
     */
    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    /**
     * @return the l_name
     */
    public String getL_name() {
        return l_name;
    }

    /**
     * @param l_name the l_name to set
     */
    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the hear
     */
    public String getHear() {
        return hear;
    }

    /**
     * @param hear the hear to set
     */
    public void setHear(String hear) {
        this.hear = hear;
    }

    /**
     * @return the feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    
    
    
    
}
