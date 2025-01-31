import java.util.Scanner;
public class PalindromeNumber{
    static boolean isPalindrome(int n){
        int originalNum=n;
        int rem,revNum=0;
        while(n!=0){
            rem=n%10;
            revNum=revNum*10+rem;
            n=n/10;
        }
        if(originalNum==revNum){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        num=sc.nextInt();
        if(isPalindrome(num)){
            System.out.println( num + " is Palindrome");
        }else{
            System.out.println( num + " is not Palindrome");
        }
    }
}