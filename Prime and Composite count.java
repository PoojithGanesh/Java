import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        int prime = 0, composite = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num <= 1)
                continue;

            int count = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0)
                    count++;
            }
          
            if (count == 2)
                prime++;
            else
                composite++;
        }
        System.out.println("Prime count: " + prime);
        System.out.println("Composite count: " + composite);
    }
}
