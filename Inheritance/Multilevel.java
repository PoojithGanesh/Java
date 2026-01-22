class Vehicle{
    void vehicledisplay(){
        System.out.println("vehicle");
    }
}

class Twowheeler extends Vehicle{
        void twowheelerdisplay(){
            System.out.println("2 wheeler");
        }
    }
    
class R192311290 extends Twowheeler{
   void bikedisplay(){
          System.out.println("bike");
        } 
  
        public static void main(String arg[]){
        R192311290 t = new R192311290();
        t.vehicledisplay();
        t.twowheelerdisplay();
        t.bikedisplay();  
        }
}
