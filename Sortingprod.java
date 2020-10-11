import java.util.*;
public class Sortingprod
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr=new int[n];
        for(int i = 0;i < n;i++)
        arr[i] = s.nextInt();
        s.close();
        int[] res = new int[n];
        for(int i = 0; i<n; i++)
        {
            int prod = 1;
            while(arr[i]>0)
            {
                int rem = arr[i]%10;
                prod = prod * rem;
                arr[i] = arr[i]/10;
                res[i] = prod;
            }
            
        }
        for(int i = 0; i<res.length; i++)
        System.out.println(res[i]);

        int temp;
        for(int i = 0; i < n-1; i++)
        {
            for(int j = i+1; j<n; j++)
            {
                if(res[i]>res[j])
                {
                    temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}