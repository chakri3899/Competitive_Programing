import java.util.*;

public class Dayseven
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        arr[i] = s.nextInt();
        s.close();
        if(arr.length%2 != 0)
        System.out.println("Wrong Input");
        ArrayList<Integer> temp = new ArrayList<Integer> ();
        for(int i = 0; i<n;i++)
        {
            int val = arr[i];
            temp.add(val);
        } 
        System.out.println(temp);
        int sum = 0;
        int i = 0;
        while(n!=0)
        {
            if(temp.size() == 1)
            {
                temp.remove(0);
                n--;
            }
            else if(temp.get(0)<temp.get(n-1))
            {
                int a = temp.get(n-1);
                temp.remove(n-1);
                n--;
                if(i%2 == 0)
                {
                    sum = sum + a;
                }   
                i++; 
            }
            else
            {
                int a = temp.get(0);
                temp.remove(0);
                n--;
                if(i%2 == 0)
                {
                    sum = sum + a;
                }
                i++;
            }
        }
        System.out.println("Sum is:"+sum);
    }
    
}