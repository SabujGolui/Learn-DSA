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
		while(t>0){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    int res = 10*x + 90*y;
		    System.out.println(res);
		    t--;
		}
	}
}
