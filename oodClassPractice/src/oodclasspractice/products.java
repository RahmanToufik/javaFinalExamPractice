
package oodclasspractice;
import java.util.Scanner;
public class products {
    private String p_name;
    private String p_id;
    private String p_price;
    private String p_exDate;
    private int p_quantity;
    Scanner sc = new Scanner(System.in);
    
    public void p_info(){
        System.out.println("Enter Product Name: ");
        p_name= sc.nextLine();
        System.out.println("Enter Product Id: ");
        p_id= sc.nextLine();
        System.out.println("Enter Product Price: ");
        p_price= sc.nextLine();
        System.out.println("Quantity: ");
        p_quantity= sc.nextInt();
        System.out.println("Enter Product Expire Date: ");
        p_exDate= sc.nextLine();
    }
    public String getName(){return p_name;}
    public String getId(){return p_id;}
    public String getPrice(){return p_price;}
    public int getQuantity(){return p_quantity;}
    public String getExDate(){return p_exDate;}
}
