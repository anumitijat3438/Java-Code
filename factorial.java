import java.util.Scanner;
public class factorial{
    static int fact(int n){
        // Base Case
        if(n<=1){
            return n;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number:");
        int n=sc.nextInt();
        System.out.print("Factoial of " + n + " is " + fact(n));
        
    }
}