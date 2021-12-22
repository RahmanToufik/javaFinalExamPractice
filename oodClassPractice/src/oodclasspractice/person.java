
package oodclasspractice;
import java.util.Scanner;
public abstract class person {
    private String name;
    private String mobile;
    
    Scanner sc = new Scanner(System.in);
    public void pInfo(){
        System.out.println("Enter name here: ");
        name = sc.nextLine();
        System.out.println("Enter mobile num here: ");
        mobile = sc.nextLine();
        
    }
}
