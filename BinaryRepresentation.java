import java.util.*;
public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>255 || n<0){
         throw new ArithmeticException("Enter the n value Between 0 and 255");
        }
        else{
            String binary=Integer.toBinaryString(n);
            StringBuilder s=new StringBuilder();
            if(binary.length()<8){
                int l=8-binary.length();
                for(int i=0;i<=(l-1);i++){
                s.append('0');
            }
            StringBuilder res=new StringBuilder(binary);
            System.out.println(s.append(binary));
        }
    }
  }
}
