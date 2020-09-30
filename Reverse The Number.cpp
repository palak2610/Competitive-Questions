#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N,r,d=0;
        cin >> N;
        
        while (N!=0)
        {
            r=N%10;
            d = d*10+r;
            N/=10;
        }
        cout << d <<endl;
    }
    
    return 0;
}
