import java.util.*;
public class PowerCalculator {
    void PowerInt(int num1,int num2){
        System.out.println(Math.pow(num1, num2));
    }
    void PowerDouble(double num1,double num2){
        System.out.println(Math.pow(num1, num2));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        PowerCalculator calsi=new PowerCalculator();
        calsi.PowerInt(num1, num2);
        calsi.PowerDouble(num1, num2);
    }
}
