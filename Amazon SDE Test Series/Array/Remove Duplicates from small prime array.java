import java.util.*;
import java.util.Scanner;

class GFG
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t>0)
    {
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i =0;i<n;i++)
      {
        arr[i] = sc.nextInt();
      }
      Solution g = new Solution();
      ArrayList <Intger> result = new ArrayList<Integer>();
      result = g.removeDuplicate(arr,n);
      
      for(int i=0;i<result.size();i++)
      {
        System.out.println(result.get(i) + " ");
      }
      System.out.println();
    t--;
    }
  }
}

class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        int dp[] = new int[100];
        ArrayList<Integer> v = new ArrayList<Integer>();
        for(int i=0; i<n; i++)
        {
            if(dp[arr[i]]==0)
            {
            dp[arr[i]]=1;
            v.add(arr[i]);       
            }
        }
        return v;
    }
}
       
