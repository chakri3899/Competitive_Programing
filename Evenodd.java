import java.util.*;
public class Evenodd 
{
    static void permute(int[] a, int k) 
    {
        if (k == a.length) 
        {
            for (int i = 0; i < a.length; i++) 
            {
                System.out.print( a[i] );
            }
            System.out.println();
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                permute(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int low = s.nextInt();
        int high = s.nextInt();
        //int k = s.nextInt();
        s.close();
        int n = (high-low) + 1;
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            arr[i] = low;  
            else         
            arr[i] = arr[i-1] + 1;
        }
        System.out.println(Arrays.toString(arr));
        permute(arr,0);
    }
}