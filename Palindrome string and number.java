import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();  
        System.out.print("Enter a number: ");
        int num = sc.nextInt();    

        String revStr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revStr = revStr + s.charAt(i);
        }

        if (s.equals(revStr))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome String");

        int temp = num;
        int revNum = 0;

        while (num > 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }

        if (temp == revNum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome Number");
    }
}
