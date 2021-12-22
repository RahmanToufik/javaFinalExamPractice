
package oodclasspractice;
import java.util.Scanner;
public class salesMan extends person {
            private String s_id;
            private String s_salary;
            private String s_bonus;
            Scanner sc = new Scanner(System.in);
            
            @Override
            public void s_Info(){
                pInfo();
                System.out.println("Enter Salesman Id: ");
                s_id = sc.nextLine();
                System.out.println("Enter Salesman Salary: ");
                s_salary = sc.nextLine();
                System.out.println("Enter Salesman Bonus: ");
                s_bonus = sc.nextLine();
              
            }       
            public String gets_id(){
                return s_id;
            }
            public String gets_salary(){
                return s_salary;
            }
            public String gets_bonus(){
                return s_bonus;
            }
   
}
