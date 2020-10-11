import java.util.*;
public class Daysix
 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        arr[i] = s.nextInt();
        s.close();
        /*int[] res = new int[n];
        int count = 0;
        for(int i = 0;i<n; i++)
        {
            if(i == 0)
            {
                System.out.println(arr[0]);
                count++;
                res[i] = arr[i];
            }
            count++;
            res[i] = arr[i];
            System.out.println(Arrays.toString(res));
            Arrays.sort(res);
            System.out.println(Arrays.toString(res));
            if(count%2 != 0)
            System.out.println(res[count/2]);
            else{
                System.out.println((res[(count-1)/2] + res[count/2])/2);
            }
        }*/
        ArrayList<Integer> res = new ArrayList<Integer> ();
        for(int i = 0;i<n;i++)
        {
            int val = arr[i];
            res.add(val);
            Collections.sort(res);
            if(res.size()%2 == 0)
            {
                int a = res.get((res.size()/2)-1);
                int b = res.get(res.size()/2);
                int avg = (a+b)/2;
                System.out.println(avg);        
            }
            else
            System.out.println(res.get(res.size()/2));
        }
    }
    
}