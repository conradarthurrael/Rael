package activity1;
import java.util.*;

public class AirFare {
    public static void main(String[] args) {
        int distance, type;
        Scanner scan=new Scanner(System.in);
        System.out.println("Distance (km): ");
        distance=scan.nextInt();
        System.out.println("Class: ");
        type=scan.nextInt();
        if(type==1){
            int economy=250;
            int total1=distance*economy;
            if(distance<=1000){
                System.out.printf("Total fare: %.2f", (float)total1);
            }
            else if(distance>1000){
                float discount1=(float) (total1*0.1);
                float totaldiscount1=total1-discount1;
                System.out.printf("Total fare: %.2f", totaldiscount1);
            }
        }
        else if(type==2){
            int business=500;
            int total2=distance*business;
            if(distance<=1000){
            System.out.printf("Total fare: %.2f", (float)total2);
            }
            else if(distance>1000){
                float discount2=(float) (total2*0.1);
                float totaldiscount2=total2-discount2;
                System.out.printf("Total fare: %.2f", totaldiscount2);
            }
        }
    }
}
