class R192311290{
  static int fact(int n){
    if(n == 1 || n == 0){
      return 1; 
    }
    else{
      return n * fact(n-1);
    }
  }
  
  public static void main(String arg[]){
    int n = 6;
    int result = fact(n);
    System.out.println(result);
  }
}
