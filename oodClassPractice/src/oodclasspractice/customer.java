
package oodclasspractice;
import java.util.Scanner;
public class customer extends person {
    private String c_id;
    private String c_address;
    private String c_type;
    private String c_mail;
    
    Scanner sc = new Scanner(System.in);
    @Override
     public void c_info(){
         pInfo();
         System.out.println("Enter Customer id: ");
         c_id = sc.nextLine();
         System.out.println("Enter Customer Address: ");
         c_address = sc.nextLine();
         System.out.println("Enter Customer Type: ");
         c_type = sc.nextLine();
         System.out.println("Enter Customer Email: ");
         c_mail = sc.nextLine();  
        }
     
         public String getc_id(){
             return c_id; }
         public String getc_address(){
             return c_address; }
         public String getc_type(){
             return c_address; }
         public String getc_email(){
             return c_mail;
             
         }
         //public void setC_type (String c_type){
              //c_type = c_type; 
          //}
     }