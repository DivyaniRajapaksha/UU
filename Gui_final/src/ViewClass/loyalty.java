/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

/**
 *
 * @author cookie
 */
public class loyalty {
     private String fn;
    private String ln;
    private String ml;
    private Integer mb;
    private String pw;
    
   public loyalty(){
        
    }
    
    public loyalty(String fn,String ln,String ml,Integer mb,String pw){
        this.fn=fn;
        this.ln=ln;
        this.ml=ml;
        this.mb=mb;
        this.pw=pw;
        
    }

    loyalty(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    /**
     * @return the fId
     */
    public String getfn() {
        return fn;
    }

    /**
     * @param fId the fId to set
     */
    public void setfn(String fn) {
        this.fn = fn;
    }
    public String getln() {
        return ln;
    }
   public void setln(String ln) {
        this.ln = ln;
    } 
  
    public String getml() {
        return ml;
    }
   public void setml(String ml) {
        this.ml = ml;
    } 
    public Integer getmb() {
        return mb;
    }
   public void setmb(Integer mb) {
        this.mb = mb;
    } 
   public String getpw() {
        return pw;
    }
   public void setpw(String pw) {
        this.pw = pw;
    } 
}
