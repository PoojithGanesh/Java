class R192311290{
  int regno;
  String name;
  R192311290(){
    System.out.println("hello");
  }
  
  R192311290(int r, String S){
    regno = r;
    name = S;
  }
  
  void display(){
    System.out.println(regno + " " + name);
  }
  
  public static void main(String arg[]){
    R192311290 R = new R192311290();
    R.display();
    R192311290 R1 = new R192311290(192311316, "Charan");
    R1.display();
  }
}
