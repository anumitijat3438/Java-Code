import java.util.Scanner;
public class ReverseAString{
    public static void main(String[] args){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        char ch;
        String revStr = "";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            revStr = ch + revStr;
        }
        System.out.println("Reversed String is " + revStr);
    }
}