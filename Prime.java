class R192311290{
  public static void main (String arg[]){
    int num = 1952;
    int sum = 0;
    
    for(int i=1; i<=num; i++){
      if(num % i == 0){
        sum++;
      }
    }
    
    if(sum == 2){
      System.out.println(num + " is a prime number");
    }
    else{
      System.out.println(num + " is not a prime number");
    }
  }
}
