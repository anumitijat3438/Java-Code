import java.util.Scanner;
public class odd_even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter Number:");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is Even");
        }else{
            System.out.println(num + " is Odd");
        }
    }
}