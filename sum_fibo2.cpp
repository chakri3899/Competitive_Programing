#include <bits/stdc++.h>
using namespace std;
const int MAX = 1000;
unsigned long long f[MAX] = {0};
unsigned long long fib(long long n)
{
    if (n == 0)
        return 0;
    if (n == 1 || n == 2)
        return (f[n] = 1);

    if (f[n])
        return f[n];
    unsigned long long k = (n & 1)? (n+1)/2 : n/2;
    f[n] = (n & 1)? (fib(k)*fib(k) + fib(k-1)*fib(k-1))
           : (2*fib(k-1) + fib(k))*fib(k);

    return f[n];
}
int calculateSum(long long n)
{
    return (fib(n+2) - 1)%10;
}
int main()
{
    int n;
    cin>>n;
   cout<< calculateSum(n) << endl;
    return 0;
}
