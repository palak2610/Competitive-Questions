import java.util.*;
import java.io.*;
import java.lang.*;

class Array
{
	public static void main(String args[]) throws IOException
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t > 0)
		{
			int n = s.nextInt();
			int r = s.nextInt();
			
			DynamicProgramming obj = new DynamicProgramming();
			System.out.println(obj.nCrModp(n,r));
			t--;
		}
	}
}
class DynamicProgramming
{
    public static int nCrModp(int n, int r)
    {
           int dp[][] = new int[n+1][r+1];
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=Math.min(i,r);j++)
        {
            if(j==0||j==i)
            {
                dp[i][j]=1;
            }
            else
            {
                dp[i][j]=dp[i-1][j-1]%1000000007 + dp[i-1][j]%1000000007;
            }
        }
    }
        return(dp[n][r]%1000000007);
    }
}
