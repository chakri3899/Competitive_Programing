import java.util.*;
public class TCSNQTProblem {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = s.nextInt();
        }
        if(n>10)
        {
            System.out.println("INVALID INPUT");
        }
        ArrayList<Integer>temp = new ArrayList<Integer>();
        ArrayList<Integer>temp2 = new ArrayList<Integer>();
        for(int i = 0;i<n;i++)
        {
            if(arr[i]<10 || arr[i]>100)
            {
                System.out.println("INVALID INPUT");
            }
            else if(arr[i]>60 && temp.size()<5)
            {
                temp.add(arr[i]);
            }
            else if(arr[i]<60 || arr[i]>60 && temp.size()==5)
            {
                temp2.add(arr[i]);
            }
        }
        int res1 = temp2.size()*15;
        int res2 = temp.size()*15;
        System.out.println("QUEUE1 TIME:"+res1+" mins");
        System.out.println("QUEUE2 TIME:"+res2+" mins");
    }
}
