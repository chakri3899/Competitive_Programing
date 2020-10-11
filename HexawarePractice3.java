import java.util.*;
public class HexawarePractice3 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        arr[i] = s.nextInt();
        s.close();
        int[] arr1 = new int[n];
        int i = 0;
        while(i< arr.length)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 1; j<=arr[i]; j++)
            {
                if(arr[i] % j == 0)
                {
                    temp.add(j);
                }
            }
            if(temp.size() >= k)
            {
                arr1[i] = temp.get(k-1);
            }
            else{
                arr1[i] = 0;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr1));
        
    }
}
