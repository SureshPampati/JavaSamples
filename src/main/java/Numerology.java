import java.util.*;
public class Numerology {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Number :");
        int Number =in.nextInt();
        int Number2=Number;
        int digit,sum=0;
        while (Number>0)
        {
            digit=Number%10;//Finds last digit of Number
            sum=sum+digit;
            Number=Number/10;//removes last digit from num
        }
        System.out.println("Sum of digits of Number is : "+sum);
        int Number1=sum;
        int sum1=0,digit1;
        while (Number1>0)
        {
            digit1=Number1%10;//Finds last digit of Number
            sum1=sum1+digit1;
            Number1=Number1/10;//removes last digit from num
        }
        System.out.println("Numerology is : "+sum1);
        int rem,odd=0,even=0;
        while (Number2>0){
            rem=Number2%10;
            if(rem%2==1)
                odd++;
            else
                even++;
            Number2=Number2/10;
        }
        System.out.println("Count of Odds in Number is : "+odd);
        System.out.println("Count of even in Number is : "+even);
    }
}
