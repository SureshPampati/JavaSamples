package Health;
import java.util.*;

public class Patient {
    double BMI(double h,double w){
        return (w/(h*h))*703;
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the PatientName :");
        String PatientName =in.nextLine();
        System.out.println("Enter the Weight of Patient :");
        double w = in.nextDouble();
        System.out.println("Enter the Weight of Patient :");
        double h = in.nextDouble();



    }
}
