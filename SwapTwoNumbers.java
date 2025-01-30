import java.util.Scanner;
public class SwapTwoNumbers{
    public static void main(String[] args){
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        x=sc.nextInt();
        System.out.println("Enter Second Number:");
        y=sc.nextInt();

        System.out.println("Before Swapping : x = " + x + ", b = " + y );
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping : x = " + x + ", b = " + y );    
    }
}