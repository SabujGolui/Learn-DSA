/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner scan = new Scanner(System.in);
	  int t = scan.nextInt();
	  while(t>0){
	      
	      int n1 = scan.nextInt();
	      int n2 = scan.nextInt();
	      
	      if(n1>n2){
	          System.out.println("A");
	      }
	      else{
	          System.out.println("B");
	      }
	      t--;
	  }
	}
}
