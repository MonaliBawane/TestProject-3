package primeNo;

import java.util.Scanner;

public class PrimeNoCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 System.out.println("prime no test");
	       String s = scan.nextLine();
	      int k= Integer.parseInt(s);
	       int no=786;int i=0;
	       int p=no/2;
	       System.out.println("value of p="+p);
	       
	       for(i=1;i<=p;i++)
	       {
	    	   System.out.println("in loop");
	    	   if(no/i==0)
	    	   {
	    		   System.out.println("no is not prime");
	    		   break;
	    	   }
	    	   System.out.println("No is prime");
	       }
	       
	        
	}

}
