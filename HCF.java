package task2;
import java.util.*;
public class HCF {

	public static void main(String[] args) {
		int hcf =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number :: ");
	      int a = sc.nextInt();
	      System.out.println("Enter second number :: ");
	      int b = sc.nextInt();
	      
	      for(int i = 1; i <= a || i <= b; i++) {
	          if( a%i == 0 && b%i == 0 )
	          hcf = i;
	       }
	       System.out.println("HCF of given two numbers is ::"+hcf);

	}

}
