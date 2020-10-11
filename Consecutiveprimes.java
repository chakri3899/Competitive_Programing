//program to print the next three consecutive prime numbers from the given prime number(input is a prime number)

import java.util.*;

public class Consecutiveprimes
{
    static int isPrime(int n)
    {
        int flag = 1;
        for(int i = 2;i <= n/2; i++)
        {
            if(n%i == 0)
            {
                flag = 0;
                break;
            }
        }
        return flag;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        
        int count = 0;
        ArrayList<Integer> temp = new ArrayList<Integer> ();
        if(isPrime(n) == 0)
        {
            System.out.println("wrong input");
        }
        else
        {
            while(count != 3)
            {
                n++;
                if(isPrime(n) == 1)
                {
                    temp.add(n);
                    count++;
                }
            }
            System.out.println(temp);
        } 
    }
}