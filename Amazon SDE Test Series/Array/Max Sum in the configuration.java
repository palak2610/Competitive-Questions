import java.util.*;
class Maxsum_Among_all_Rotations_Array
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				sc.nextInt();
			System.out.println(new GFG().max_sum(arr,n));
		t--;
		}
	}
}

class GfG
{
    int max_sum(int A[], int n)
    {
 		int sum=A[0];
		int max_sum=0;
		for(int i=1;i<n;++i)
		{ 
			sum+=A[i];
    			max_sum+=(i)*A[i];
		}
		int res=max_sum;
 		for(int i=1;i<n;++i)
 		{
     			max_sum=max_sum-(sum-A[i-1])+A[i-1]*(n-1);
     			res=Math.max(res,max_sum);
 		}
 	return res;
    } 
}
