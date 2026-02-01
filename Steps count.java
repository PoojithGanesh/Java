class R192311290 {
    public static void main(String[] args) {
        int n = 20;
        int steps = 0;

        while (n > 0) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = n - 1;
            steps++;
        }
        System.out.println("Steps taken = " + steps);
    }
}
