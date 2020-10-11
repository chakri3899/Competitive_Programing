#include<bits/stdc++.h>
using namespace std;
unsigned long long fibonac(int n)
{
  unsigned long long fibo[n+1];
  fibo[0]=0;
  fibo[1]=1;
  unsigned long long sum = (fibo[0]*fibo[0]) + (fibo[1]*fibo[1]);
  for(int j=2; j<=n; j++)
  {
    fibo[j]=fibo[j-1] + fibo[j-2];
    sum = sum + (fibo[j]*fibo[j]);
  }
  return sum%10;
}
int main()
{
	int n;
	cin>>n;
	long long c = fibonac(n);
	cout<<c;
	return 0;
}
