package activity1;
import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //This is Conrad Rael
        String studentname;
        int subjects, z;
        float totalgrade=0;
        float average=0;
        int[] grades=new int[100];
        System.out.println("Enter student name: ");
        studentname=scan.next();
        System.out.println("Enter number of subjects: ");
        subjects=scan.nextInt();
        for(z=0; z<subjects; z++){
            System.out.println("Enter grade for sub"+(z+1)+": ");
            grades[z]=scan.nextInt();
            totalgrade+=grades[z];
        }
        average=totalgrade/subjects;
        System.out.println(average);
        if(average>74){
            System.out.println("Remarks: PASSED");
        }
        else {
            System.out.println("Remarks: FAILED");
        }
    }
    
}
