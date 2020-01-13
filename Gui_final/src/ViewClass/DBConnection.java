/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

/**
 *
 * @author Acer
 */
public class DBConnection {
    private static ArrayList<FoodItem> al=new ArrayList<FoodItem>(); 
    private static ArrayList<Category> al1=new ArrayList<Category>(); 
    private static ArrayList<Employee> al2=new ArrayList<Employee>();
     private static ArrayList<loyalty> arr=new ArrayList<loyalty>();  
    public  Connection getDBConnection() throws Exception{
        final String DBURL="jdbc:mysql://localhost:3306/foodordering";
        final String USERNAME="root";
        final String PASSWORD="root";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(DBURL,USERNAME,PASSWORD);
        return conn;
    }

    public  void insertData(FoodItem f1)throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql="insert into foodItem (fId,name,price,description,cId) values ('"+f1.getfId()+"','"+f1.getName()+"','"+f1.getPrice()+"','"+f1.getDescription()+"','"+f1.getCatId()+"')";
        stmt.executeUpdate(sql);
        c.close();

    }
    public void addImage(FoodItem f1,File file)throws Exception{
        Connection c=getDBConnection();
        PreparedStatement ps=c.prepareStatement("update foodItem set image =? where fId ='"+f1.getfId()+"'");
                        ps.setBinaryStream(1,f1.getMyImage(),(long)file.length());
           //  ps.setString(2,"HHHH");
			ps.executeUpdate();
                       
			ps.close();
    }
    
    public  ArrayList<FoodItem> viewData ()throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql ="Select * from foodItem";
        ResultSet rs=stmt.executeQuery(sql);
        
        while(rs.next()) {
            FoodItem f1=new FoodItem(rs.getString("fId"),rs.getString("name"),rs.getString("description"),rs.getDouble("price"),rs.getInt("cId"),rs.getBytes("image"));
            al.add(f1);
        }
        c.close();
       return al;
    }
   
    public  void updateData (FoodItem f1)throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql ="update foodItem set fId ='"+f1.getfId()+"',name='"+f1.getName()+"',description='"+f1.getDescription()+"',price='"+f1.getPrice()+"',cId='"+f1.getCatId()+"' where fId ='"+f1.getfId()+"'";
        stmt.executeUpdate(sql);
        c.close();
    }
    
     public  void deleteItem (String name)throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        System.out.println("Hi");
       String sql ="delete from foodItem where fId ='"+name+"'";
       stmt.executeUpdate(sql);
        c.close();
    }
     
      public  void addcategory(Category c1)throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql="insert into category (cId,name,description) values ('"+c1.getcId()+"','"+c1.getName()+"','"+c1.getDescription()+"')";
        stmt.executeUpdate(sql);
        c.close();

    }
      
       public  ArrayList<Category> viewCategory ()throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql ="Select * from category";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()) {
            Category f1=new Category(rs.getString("cId"),rs.getString("name"),rs.getString("description"));
            al1.add(f1);
        }
        c.close();
       return al1;
    }
       public  void addEmp(Employee e1)throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql="insert into employee (eId,fName,lName,lane,street,city,position,email,dob,salary) values ('"+e1.geteId()+"','"+e1.getfName()+"','"+e1.getlName()+"','"+e1.getLane()+"','"+e1.getStreet()+"','"+e1.getCity()+"','"+e1.getPosition()+"','"+e1.getEmail()+"','"+e1.getDob()+"','"+e1.getSalary()+"')";
        stmt.executeUpdate(sql);
        String sql1="insert into phn_emp(empno,phoneno) values ('"+e1.geteId()+"','"+e1.getPhoneNo()+"')";
         stmt.executeUpdate(sql1);
        c.close();

    }
    public  ArrayList<Employee> viewEmp ()throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql ="Select * from employee";
       
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()) {
             
            Employee f1=new Employee(rs.getString("eId"),rs.getString("fName"),rs.getString("lName"),rs.getString("lane"),rs.getString("street"),rs.getString("city"),rs.getString("position"),rs.getString("email"),rs.getString("dob"),rs.getDouble("salary"),123);
            al2.add(f1);
        }
        c.close();
       return al2;
    }
     public  ArrayList<FoodItem>  FoodView(int catID)throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql ="Select * from foodItem where cId ='"+catID+"'";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next()) {
            FoodItem f1=new FoodItem(rs.getString("fId"),rs.getString("name"),rs.getString("description"),rs.getDouble("price"),rs.getInt("cId"),rs.getBytes("image"));
            al.add(f1);
        }
        c.close();
       return al;
    }
     public void addOrder(ArrayList<FoodOrder> al,Order o1) throws Exception{
          Connection c=getDBConnection();
           Statement stmt=c.createStatement();
              Calendar calendar = Calendar.getInstance();
               java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
               java.sql.Time time=new java.sql.Time(calendar.getTime().getTime());
               System.out.println(startDate);
               System.out.println(time);
            String sql="insert into foodordering.order (oId,date,time,totPrice,cusId) values (?,?,?,?,?);";
              PreparedStatement preparedStmt = c.prepareStatement(sql);
                     preparedStmt.setInt(1, o1.getoId());
                     preparedStmt.setDate(2, startDate);
                     preparedStmt.setTime  (3, time);
                     preparedStmt.setDouble(4, o1.getTotPrice());
                     preparedStmt.setString(5, "1");
                      preparedStmt.execute();
            Iterator itr=al.iterator();  
            while(itr.hasNext()){ 
                 FoodOrder c2=(FoodOrder)itr.next();  
                String sql1="insert into foodorder (oId,fId,quantity) values ('"+c2.getoId()+"','"+c2.getfId()+"','"+c2.getQuantity()+"')";
                stmt.executeUpdate(sql1);
            }
            c.close();
        
     }
     public  void insertloycus(loyalty lc1)throws Exception{
        Connection c=getDBConnection();
        Statement stamt=c.createStatement();
        //double price=f1.getPrice();
        String msq="insert into loyaltycus (fname,lname,mail,mobile,password) values ('"+lc1.getfn()+"','"+lc1.getln()+"','"+lc1.getml()+"','"+lc1.getmb()+"','"+lc1.getpw()+"')";
        stamt.executeUpdate(msq);
        c.close();
System.out.println("hi");
    } 
    
     public  ArrayList<loyalty> viewloyaltycus ()throws Exception{
        Connection b=getDBConnection();
        Statement statmt=b.createStatement();
        String sql ="Select * from loyaltycus";
        ResultSet res=statmt.executeQuery(sql);
        while(res.next()) {
            loyalty lc1 = new loyalty(res.getString("fn"),res.getString("ln"),res.getString("ml"),res.getInt("mb"),res.getString("pw"));
            arr.add(lc1);
        }
        b.close();
       return arr;
    }
    
      public  void insertPromotion(Promotion f1)throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql="insert into promotions (promotion_id,name,description) values ('"+f1.getpId()+"','"+f1.getName()+"','"+f1.getDescription()+"')";
        stmt.executeUpdate(sql);
        c.close();

    }   
    
   
    
    
    
    
    public  void insertFeedback(Feedbacks f1)throws Exception{
        Connection c=getDBConnection();
        Statement stmt=c.createStatement();
        String sql="insert into feedback (f_name,l_name,email,hear,details) values ('"+f1.getF_name()+"','"+f1.getL_name()+"','"+f1.getEmail()+"','"+f1.getHear()+"','"+f1.getFeedback()+"')";
        stmt.executeUpdate(sql);
        c.close();

    }  
}