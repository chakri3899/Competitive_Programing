import java.util.*;

public class Solution2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int sum = 0;
        for(int i = n-1; i>=0; i--)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    } 
}
