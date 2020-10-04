import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt()
			int arr[] = new int[n];
			for(int i=0; i<n; i++)
			{
				arr[i] = sc.nextInt();
			}
			GFG g = new GFG();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
class GfG
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    if(n>=3)
    	    {
    	        Arrays.sort(a);
    	        return a[n-3];
    	    }
    	else
    	{
    	    return -1;
    	}
    }
}
