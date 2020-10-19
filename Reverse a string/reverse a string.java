import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    String str = sc.next();
		    for(int j=str.length()-1;j>=0;j--)
		    {
		        System.out.print(str.charAt(j));
		    }
		    System.out.println();
		    t--;
		}
	}
}
