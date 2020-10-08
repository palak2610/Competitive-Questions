import java.util.*;
class ArrPathSum1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int m = sc.nexInt();
			int n = sc.nextInt();
			int ar1[] = new int[m];
			int ar2[] = new int[n];
			for(int i =0;i<m;i++)
			{
				ar1[i] = sc.nextInt();
			}
			for(int i =0;i<n;i++)
			{
				ar2[i] = sc.nextInt();
			}
		GFG g = new GFG();
		System.out.println(g.maxPathSum(ar1,ar2));
		T--;
		}
	}
}
class GfG
{
    /*You are required to complete this method
    * ar1 : 1st array
    * ar2 : 2nd array
    */
    
    int maxPathSum(int A[], int B[])
    {

    //Your code here
    int i=0,j=0;
    int l1 = A.length;
    int l2 = B.length;
    int result=0;
    int sum1=0;
    int sum2=0;
    while(i<l1 && j<l2)
    {
        if(A[i]<B[j])
        {
            sum1 += A[i++]; 
        }
        else if(A[i]>B[j])
        {
            sum2 += B[j++];
        }
        else
        {
            result +=Math.max(sum1,sum2);
             sum1=0;
             sum2=0;
            while(i<l1 && j<l2 && A[i]==B[j])
            {
                result = result + A[i++];
                j++;
            }
        }
    }
    while(i<l1)
    {
        sum1 += A[i++];
    }
    while(j<l2)
    {
        sum2 += B[j++];
    }
    result += Math.max(sum1,sum2);
    return result;

        
    }
}
