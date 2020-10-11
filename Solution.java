import java.util.*; 
  
class Solution  
{ 
    static int countDer(int n) 
    { 
        if (n == 1) return 0; 
        if (n == 0) return 1; 
        if (n == 2) return 1; 
           
        return (n - 1) * (countDer(n - 1) + countDer(n - 2)); 
    } 
      
    public static void main (String[] args) 
    { 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println(countDer(n)); 
    } 
} 
