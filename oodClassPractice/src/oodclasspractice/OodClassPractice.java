
package oodclasspractice;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;
public class OodClassPractice {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        /*-----p infos-----*/
        System.out.println(" How many product want to buy: ");
        int pNumber = sc.nextInt();
        sc.nextLine();
        
        products p[]= new products[pNumber];
        for (int i=0; i<pNumber; i++){
            p[i]= new products();
            p[i].p_info();
        }
         /*-----c infos-----*/
         System.out.println("Eter Number of Customer: ");
         int cNumber= sc.nextInt();
         sc.nextLine();
         
         customer c[]= new customer [cNumber];
         for (int j=0; j<cNumber; j++){
             c[j]= new customer();
             c[j].c_info();
         }
         
            /*-----s infos-----*/
            System.out.println("Number of Sales man: ");
            int sNumber = sc.nextInt();
            sc.nextLine();
            
            salesMan s[]= new salesMan[sNumber];
            for (int k =0; k<sNumber; k++){
                s[k]= new salesMan();
                s[k].s_Info();
            }
            /*try {
                writer = new FileWriter("Output.txt");
                writer.write(text);
                writer.flush();
                writer.close();
                } catch (IOException e){e.printStackTrace();}*/
    
            System.out.println("------------Welcoe to our Online Shopping--------------");
              System.out.println("Please enter the customer ID: ");
        String Customer_ID = sc.nextLine();
        boolean check = true;
        for (int i = 0; i<pNumber; i++){
            System.out.println("Product ID: "+p[i].getId());
            System.out.println("Product Name: "+p[i].getName());
            System.out.println("Product Quantity: "+p[i].getQuantity());
            System.out.println("Product Price: "+p[i].getPrice());
            System.out.println("Expire Date: "+p[i].getExDate());
        }

        System.out.println("How many products do want to buy: ");
        int numberOfProduct = sc.nextInt();
        sc.nextLine();
        String NumberOfProduct[] = new String[numberOfProduct];

        for (int l = 0; l<numberOfProduct; l++){
            System.out.println("Product No. "+l+" ");
            NumberOfProduct[l] = sc.nextLine();
        }

        double totalPrice= 0.0;
        for (int l = 0; l<numberOfProduct; l++){
            System.out.println("Enter the quantity of Product ID: ");
            int amount = sc.nextInt();
            sc.nextLine();
            int productID=0;
            while(check){
                if(NumberOfProduct[l].equalsIgnoreCase(p[productID].getId())){
                    double getprice = p[productID].getPrice();
                    if (amount<=p[productID].getQuantity()){
                        totalPrice = totalPrice + amount*getprice;
                        check = false;
                    }
                }
                productID++;
            }
            check = true;
        }
        System.out.println("Total Price: "+totalPrice+" BDT");

        if (totalPrice>1000){
            System.out.println("Commission in persenatge: ");
            double commission = sc.nextDouble();
            sc.nextLine();
            double totalbonus = s[1].Bonus(commission);
            System.out.println("Total Salary with bonus: "+s[1].Bonus());
        }
    }
    
}
