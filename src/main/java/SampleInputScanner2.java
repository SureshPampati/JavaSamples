import java.util.*;
public class SampleInputScanner2 {
    public static void main(String[] args)
    {
        System.out.println("Enter the Account Number :");
        Scanner in = new Scanner(System.in);
        long AccountNumber =in.nextLong();
        System.out.println("Enter the Initial Balance :");
        double InitialAmount=in.nextDouble();
        System.out.println("Enter the Amount Depositing :");
        long Deposit =in.nextLong();
        double TotalAmount=InitialAmount+Deposit;
        System.out.println("Total Account Balance is :"+TotalAmount);
        System.out.println("Enter the Amount to withdraw :");
        long Withdraw = in.nextLong();
        if(Withdraw>TotalAmount) {
            System.out.println("Insufficient Funds Available balance is : " + TotalAmount);
        }
          else{
              double Total_After_Withdraw = TotalAmount-Withdraw;
              System.out.println("Total Acount balance is : "+Total_After_Withdraw);
        }


    }
}

