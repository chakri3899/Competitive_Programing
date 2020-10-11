#include<bits/stdc++.h>
using namespace std;
unsigned long long fibonac(unsigned long long fibo[],long long n)
{
  fibo[0]=0;
  fibo[1]=1;
  for(long long j=2; j<=n; j++)
  {
    fibo[j]=(fibo[j-1] + fibo[j-2])%10;
  }
  return fibo[n];
}
int Lastdigit(int n)
{
	unsigned long long fibo[60]={0};
	fibonac(fibo,60);
	return fibo[n%60];
}
int main()
{
	int n;
	cin>>n;
	cout<<Lastdigit(n);
	return 0;
}
