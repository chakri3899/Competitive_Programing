#include<bits/stdc++.h>
using namespace std;
unsigned long long fibonac(int n)
{
  double fi = (1 + sqrt(5))/2;
  return round(pow(fi,n)/sqrt(5));
}
unsigned long long fisum(int n, int m)
{
  unsigned long long sum = 0;
  for (int i = m;i<=n; i++)
  sum += fibonac(i);
  return sum%10;
}
int main()
{
	int n,m;
	cin>>n>>m;
	long long c = fisum(n,m);
	cout<<c;
	return 0;
}
