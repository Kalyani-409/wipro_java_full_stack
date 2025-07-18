package Exceptions;
import java.util.*;
public class OutOfBoundsException {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 try {
	 System.out.println("Enter the number of elements in the array");
	 int n=sc.nextInt();
	 int[] arr=new int[n];
	 System.out.println("Enter the elements of the array");
	 for(int i=0;i<n;i++) {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println("Enter the index of the array you want to access");
	 int k=sc.nextInt();
	 System.out.println("Element at index " + k + ": " + arr[k]);
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array index out of bounds exception");
     }
	 finally {
		 System.out.println("Try catch block is excecuted");
	 }
  }
}
