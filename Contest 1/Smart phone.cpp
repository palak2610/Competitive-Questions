#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
    
long long fix_price = 30;
long long a[100],b[100];
long long n, budget,max_revenue;
    cin>>n;
	int count = 0;
		for(int i=0;i<n;i++)
    	{
    	cin>>a[i];
		}
		sort(a,a+n);
		for(int i=0;i<n;i++)
    	{
			b[i] = a[i]*(n-i);
		}
		sort(b,b+n);
		cout<<b[n-1];
}

