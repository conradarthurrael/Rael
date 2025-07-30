package activity1;
import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String employeename;
        float hourlyrate, weeklywage=0, sss, netweekly;
        int totalhours;
        System.out.print("Enter employee name: ");
        employeename=scan.nextLine();
        System.out.print("Enter hourly rate: ");
        hourlyrate=scan.nextFloat();
        System.out.print("Enter total hours worked: ");
        totalhours=scan.nextInt();
        
        System.out.println("----Wage Summary----");
        System.out.println("Employee: "+employeename);
        System.out.printf("Hourly Rate: ₱%.2f\n",hourlyrate);
        System.out.println("Hours Worked: "+totalhours);
        weeklywage=hourlyrate*totalhours;
        System.out.printf("Gross Weekly Wage: ₱%.2f\n",weeklywage);
        sss=(float) (weeklywage*0.1);
        System.out.printf("SSS Contribution (10%%): ₱%.2f\n",sss);
        netweekly=weeklywage-sss;
        System.out.println("-------------------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f\n", netweekly);
    }
}
