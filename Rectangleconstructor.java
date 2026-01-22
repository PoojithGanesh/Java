class R192311290{
  double length;
  double width;
  
  R192311290(double l, double w){
    length = l;
    width = w;
  }
  
  double calculatearea(){
    return length * width;
  }
  
  public static void main(String arg[]){
    R192311290 rec = new R192311290(18, 9);
    System.out.println(rec.calculatearea());
  }
}
