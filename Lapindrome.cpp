#include <bits/stdc++.h>
#include<string>
using namespace std;
const int MAX_CHAR =26;
bool Lapindrome(string str)
{
	int j,i,len;
	int count1[MAX_CHAR] = {0}; 
    int count2[MAX_CHAR] = {0};
    len = str.size();
    if (len == 1) 
        return true; 
	for(int i=0, j=len-1; i<j; i++, j--)
		{
			count1[str[i]-'a']++;
			count2[str[j]-'a']++;
		}
		for(i=0;i<MAX_CHAR;i++)
		{
			if(count1[i]!=count2[i])
				return false;
		return true;
		}
}
int main()
{
	string str;
	int t,len;
	
	cin>>t;
	while(t--)
	{
		cin>>str;
		if(Lapindrome(str))
		{
			cout<<"Yes";
		}
		else
		{
			cout<<"No";
		}
	}
	
}
