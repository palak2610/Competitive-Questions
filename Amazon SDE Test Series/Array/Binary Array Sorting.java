import java.util.*;
import java.io.*;

class GFG
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t>0)
		{
			int n = sc.nextInt();
			int array[] = new int[n];
			for(int i=0;i<n;i++)
				array[i] = sc.nextInt();
			Solution ob= new Solution();
			int result[] = new int[n];
			result = ob.SortBinaryArray(array, n);
			
			for(int i=0;i<n;i++)
				System.out.println(result[i]+" ");
			System.out.println();
			t--;
		}
	}
}
class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
        int zero = 0;
        int t;
        for(int i = 0; i < n; i++) 
        {
            if(arr[i] == 0) 
            {
                t = arr[i];
                arr[i] = arr[zero];
                arr[zero] = t;
                zero += 1;
            }
        }
    	return arr;
	}
	
}
