import java.util.Scanner;
import java.lang.Math;

class Convert_To-Five
{
 	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int N = sc.nextInt();
			System.out.println(new GFG().convertfive(N));
			T--;
		}
	}
}
class GfG {
    int convertfive(int num) {
        int pow = 1;
        int newnum = 0;
        while(num!=0)
        {
            int digit = num%10;
            if(digit == 0)
            {
                newnum += 5 * pow;
            }
            else
            {
                newnum += digit * pow;
            }
            pow = pow*10;
            num/=10;
        }
        return newnum;
        // Your code here
    }
}
