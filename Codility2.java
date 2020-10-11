import java.util.*;

public class Codility2 {
    static boolean solution(String s)
    {
        int n = s.length();
        int a = s.indexOf("b");
        boolean f = true;
        if(a == -1)
        {
            f= true;
        }
        else if(n == 1 && a == 0)
        {
            f = true;
        }
        else 
        {
        for(int i = a+1; i<n; i++)
        {
            if(s.charAt(i) == 'a')
            {
                f = false;
            }   
        }
        }
        return f;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        s.close();
        System.out.println(solution(str));

    }
}
