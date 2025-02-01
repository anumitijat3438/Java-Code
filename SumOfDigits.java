import java.util.Scanner;
public class SumOfDigits{
    static int calculateSumOfDigits(int number){
        int Digit , sum = 0;
        while(number>0){
            Digit=number%10;
            sum=sum+Digit;
            number=number/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int sumOfDigits=calculateSumOfDigits(number);
        System.out.printf("Sum of digits of " + number + " is: " + sumOfDigits);
    }
}