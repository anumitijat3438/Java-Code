import java.util.Scanner;
public class NumberOfDigits{
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number:");
        num=sc.nextInt();
        int count=0;
        int n=num;
        if(num<0) 
        { 
            num = num * -1; 
        } else if (num==0) { 
            num=1;             
        }
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Number of Digits in " + n + " is " + count);
    }
}