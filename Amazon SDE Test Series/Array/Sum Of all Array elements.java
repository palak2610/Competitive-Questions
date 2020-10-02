import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0)
		{
		    int size = sc.nextInt();
    		int a[] = new int[size];
    		int sum = 0; 
		    for (int i=0;i<size; i++)
		    {
		        a[i] = sc.nextInt();
                sum = sum + a[i]; 
		    }
		    System.out.println(sum);
		    T--;
		}
		
	}
}