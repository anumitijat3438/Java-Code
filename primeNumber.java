import java.util.Scanner;
public class primeNumber{
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number:");
        number=sc.nextInt();
        if(isPrime(number)){
            System.out.println(number+ " is Prime");
        }else{
            System.out.println(number+ " is not Prime");
        }
    }
}