/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int x,y,z;
		
		while(t>0){
		    x=scan.nextInt();
		    y=scan.nextInt();
		    z=scan.nextInt();
		    
		    if(z>=x && y>z){
		        System.out.println("YES");
		    }
		    else{
		      System.out.println("NO");   
		    }
		    
		    t--;
		}
	}
}