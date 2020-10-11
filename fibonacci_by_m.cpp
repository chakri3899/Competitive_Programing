#include<bits/stdc++.h>
using namespace std;
long long fibonac(int n, int m)
{
  long long fibo[n+1];
  fibo[0]=0;
  fibo[1]=1;
  for(int j=2; j<=n; j++)
  {
    fibo[j]=fibo[j-1] + fibo[j-2];
  }
  return fibo[n]%m;
}
int main()
{
	int n,m;
	cin>>n>>m;
	long long c = fibonac(n,m);
	cout<<c;
	return 0;
}
