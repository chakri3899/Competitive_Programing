import java.util.*;

public class HexawarePractice1 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        arr[i] = s.nextInt();
        s.close();
        int max = arr[0];
        for(int i = 1; i<n; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        //System.out.println(max);
        
        for(int i = 0; i<n; i++)
        {
            int count = 0;
            for(int j = 0; j<=max; j++)
            {
               for(int k = 0; k<=max; k++)
               {
                   int x = (int)(Math.pow(a,j) + Math.pow(b,k));
                   if(x < arr[i])
                   {
                       //System.out.print(x);
                       count++;
                   }
               }
            }
            System.out.print(count+" ");
        }
    }
}
