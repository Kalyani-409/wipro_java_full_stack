import java.util.Scanner;

public class Palindrome1{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int rev=0;
        int result=0;
        int temp=n;
        for(int i=0;n>0;i++){
            rev=n%10;
            result=result*10+rev;
            n=n/10;
        }

        if(temp==result){
            System.out.println(result+" "+" is Palindrome");
        }
        else{
            System.out.println(result+" "+"is not a Palindrome");
        }
        }
    }


