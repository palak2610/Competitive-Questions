import java.io.*;
import java.util.*;

class ArrayMax{
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0;i<sizeOfArray; i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max){
                max2 = arr[i];
            }
        }
        if(max2 == Integer.MIN_VALUE){
            max2 = -1;
        }
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(max);
        res.add(max2);
        return res;   
    }
}
class Array 
{
	public static void main(String[] args) throws IOException
	{	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0)
		{
			int n = Ineger.parseInt(br.readLine());
			int arr[] = new int[n];
			String line = br.readLine();
			String[] elements = line.trim().split("\\s+");
			
			for(int i=0;i<n;i++)
			{
				arr[i] = Integer.parseInt(elements[i]);
			}
			
			ArrayMax obj = new ArrayMax();
			ArrayList<Integer> res = new ArrayList<Integer>();
			res = obj.largestAndSecondLargest(n,arr);
			System.out.println(res.get(0) + " " + res.get(1)_;
		}
	}
}
