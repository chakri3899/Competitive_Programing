import java.util.*;

public class Solution1 {    
    static int find(int arr[], int n)
    {
        int[] before = new int[n];
        before[0] = arr[0];
        for(int i = 1; i<n; i++)
        {
            before[i] = before[i-1] + arr[i];
        }
        int[] after = new int[n];
        after[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--)
        {
            after[i] = after[i+1] + arr[i];
        }
        for(int i = 1; i<n-1; i++)
        {
            if(before[i] == after[i])
            return i;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n; i++)
        arr[i] = s.nextInt();
        s.close();
        System.out.println(find(arr, n));
    }   
}
