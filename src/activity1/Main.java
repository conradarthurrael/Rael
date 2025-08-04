
package activity1;

import Banking.bankingClass;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt=3;
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
       
                bankingClass bc = new bankingClass();
                
                System.out.println("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.println("Enter your Pin: ");
                int pin = sc.nextInt();
              
                    if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                    }
                    while(!bc.verifyAccount(accountNo, pin)){
                        attempt--;
                        if(attempt<1)
                            System.exit(0);
                        System.out.println("LOGIN FAILED, Please try again, attempt: "+attempt);
                        System.out.println("Enter your Account No: ");
                        accountNo = sc.nextInt();

                        System.out.println("Enter your Pin: ");
                        pin = sc.nextInt();
                        if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                   
                    }
                    }
                
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
            
    }
    
}
