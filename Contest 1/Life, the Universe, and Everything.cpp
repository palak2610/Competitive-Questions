#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int i;
	int arr[5];
	for(i=0;i<=4;i++)
	{
	    cin>>arr[i];
	}
	for(i=0;i<=4;i++)
	{
	    if(arr[i]==42)
	    {
	        break;
	    }
	    cout<<arr[i]<<"\n";
	}
	return 0;
}

