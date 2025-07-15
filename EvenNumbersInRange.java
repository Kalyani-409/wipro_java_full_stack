import java.util.*;
public class EvenNumbersInRange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        for(int i=s;i<e;i++){
          if(i%2==0){
            System.out.println(i);
          }
        }
    }
}
