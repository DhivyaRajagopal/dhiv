import java.io.*;
import java.util.*;
class Calculator{
	public static void main(String args[])
	{
		System.out.println("THE BASIC CALCULATOR");
		System.out.println("Enter the 1st num");
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		System.out.println("Enter the 2nd num");
		Scanner sc=new Scanner(System.in);
		int n2=sc.nextInt();
		System.out.println("Enter the operator from the list + * / -");
		Scanner sca=new Scanner(System.in);
		String op=sca.next();
		if(op=="+")
		{
			System.out.println("ur calculation result for add:"+(n1+n2));
		}
		else if(op=="-")
		{
	    System.out.println("ur calculation result for sub:"+(n1-n2));
	   }
	   else if(op=="/")
		{
	    System.out.println("ur calculation result for div:"+(n1/n2));
	   }
	   else if(op=="*")
		{
	    System.out.println("ur calculation result for div:"+(n1*n2));
	   }
	   else
	   {System.out.println("enter correct operator");
	   
	   }
	}
}
