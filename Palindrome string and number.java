import java.util.Scanner;
public class PalindromeSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose option");
        System.out.println("1.String");
        System.out.println("2.Number");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                String s = sc.next();
                String r = "";
                for (int i = s.length()-1; i >= 0; i--)
                    r += s.charAt(i);
                System.out.println(s.equals(r) ? "string Palindrome" : "Not string Palindrome");
                break;

            case 2:
                int n = sc.nextInt(), rev = 0, t = n;
                while (n > 0) {
                    rev = rev * 10 + n % 10;
                    n /= 10;
                }
                System.out.println(t == rev ? "number Palindrome" : "Not number Palindrome");
        }
    }
}
