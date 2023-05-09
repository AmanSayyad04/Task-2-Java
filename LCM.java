package task2;
import java.util.*;
public class LCM {

	public static void main(String[] args) {
		
		int gcd=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number :: ");
	      int a = sc.nextInt();
	      System.out.println("Enter second number :: ");
	      int b = sc.nextInt();
	      
	      for(int i = 1; i <= a && i <= b; ++i)   
	      {  
	    	  if(a % i == 0 && b % i == 0)  
	    		  gcd = i; 
	      }
	      int lcm = (a * b) / gcd;
	      System.out.println("The LCM is : " + lcm);

	}

}
