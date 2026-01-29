class Factors {
    public static void main(String[] args) {

        int num = 10;
        int n = 3;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
                if (count == n)
                    System.out.println("Nth factor: " + i);
            }
        }

        System.out.println("Number of factors: " + count);
    }
}
