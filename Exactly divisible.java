class R192311290{
    public static void main(String arg[]){
        String s = "Welcome";
        int num = 10;
        int a = 5;
        int b = 2;
        
        if(num % a == 0 && num % b == 0){
            System.out.println(s);
        }
        else if(num % a == 0 || num % b == 0){
            System.out.println(s);
        }
        else{
            System.out.println("none"); 
        }
    }
}
