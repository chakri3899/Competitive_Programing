package HackerRank;
import java.util.*;

public class Lexicographicstring {
    public static String getSmallestAndLargest(String s, int k)
    {
        int n = s.length();
        String[] str = new String[n-k+1];
        String smallest = "";
        String largest = "";
        int p=0, q=k;
        while(q<=n)
        {
            str[p]=s.substring(p,q);
            p++;
            q++;
        }
        for(int i = 0;i<str.length;i++)
        {
            for(int j = i+1;j<str.length; j++)
            {
                if(str[i].compareTo(str[j]) > 0)
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(str));
        smallest = str[0];
        largest = str[str.length-1];
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
