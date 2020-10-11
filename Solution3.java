import java.util.*;
// import java.math.*;
public class Solution3 {
    static boolean find(int n)
    {
        int sum = 0;
        /*for(int i = 2; i<=n/2; i++)
        {
            if(n%i == 0)
            sum = sum + i;
        }*/
        for (int i=2; i<=Math.sqrt(n); i++) 
        {
            if (n%i==0) 
            {  
                if (i==(n/i)) 
                    sum += i; 
                else
                    sum += (i + n/i); 
            } 
        }
        boolean flag = false;
        if((sum+1)>n)
        {
            flag = true;
        }
        return flag;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int count = 0;
        for(int i = 0; i<=n; i++)
        {
            if(find(i) == true)
            {
                count = count + i;
            }
        }
        System.out.println(count);
    }
}
