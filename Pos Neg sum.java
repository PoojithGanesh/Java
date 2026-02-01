import java.util.*;
class R192311290{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int possum = 0;
        int negsum = 0;
        int poscount = 0;
        int negcount = 0;
        System.out.println("Enter number (-1 to stop):");
        while(true){
            num = sc.nextInt();
            if(num == -1){
                break;
            }
            if(num>0){
                possum += num;
                poscount++;
            }
            else if(num<0){
                negsum += num;
                negcount++;
            }
        }
        
        if(poscount>0){
            System.out.println(possum);
        }
        if(negcount>0){
            System.out.println(negsum);
        }
        if(poscount>0){
            System.out.println(possum/(double) poscount);
        }
        if(negcount>0){
            System.out.println(negsum/(double) negcount);
        }
        
            
    }
}
