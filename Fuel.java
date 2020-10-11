import java.util.*;
class Fuel
{
int MinRefill(int l, int n, int x[],int d)
{
int numrefills=0;
int currentrefill=0;
int lastrefill;
if((x[currentrefill]+l)>=d)
{
return numrefills;
}
while(currentrefill<=n)
{
 lastrefill=currentrefill;
while((currentrefill<=n) && (x[currentrefill+1]-x[lastrefill])<=l)
{
  currentrefill=currentrefill+1;

}

if(currentrefill==lastrefill)
{
return -1;
}
if(currentrefill<=n)
{
 numrefills+=1;
}
}
return numrefills;
}
public static void main(String args[])
{
fuel f=new fuel();
Scanner s= new Scanner(System.in);
int d=s.nextInt();
int l=s.nextInt();
int n=s.nextInt();
int x[]=new int[n+2];
x[0]=0;
x[n+1]=d;
for(int i=1;i<n+1;i++)
{
  x[i]=s.nextInt();
}
s.close();
int ans=f.MinRefill(l,n,x,d);
System.out.println(ans);

}
}

