/*Question: https://www.programmersdoor.com/post/tcs-codevita-prime-fibonacci#:~:text=Make%20all%20possible%20unique%20combinations,you%20found%20in%20step%201.&text=Consider%20the%20smallest%20and%20largest,primes%20in%20the%202nd%20list*/

import java.util.*;

public class codevita1 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        //finding prime numbers between a and b
        ArrayList<Integer> temp = new ArrayList<Integer> ();
        for(int i = a; i < b; i++)
        {
            if(i == 1 || i == 0)
            continue;
            int flag = 1;
            for(int j = 2; j <= i/2; ++j)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;                
                }  
            }
            if(flag == 1)
            temp.add(i);
        }
        System.out.println(temp);

        //finding all possible combinations from the obtained list of prime numbers
        ArrayList<Integer> temp2 = new ArrayList<Integer> ();
        for(int i = 0; i < temp.size(); i++)
        {
            String str1 = Integer.toString(temp.get(i));
            for(int j = 0; j < temp.size();j++)
            {
                if(i == j)
                continue;
                String str2 = Integer.toString(temp.get(j));
                int com1 = Integer.parseInt(str1 + str2);
                temp2.add(com1);
            }
        }
        System.out.println(temp2);
        /*This code is also correct but lengthy so replaced it with above for loop 
        for(int i = 0; i < temp.size()-1; i++)
        {
            String str1 = Integer.toString(temp.get(i));
            for(int j = i+1; j < temp.size();j++)
            {
                String str2 = Integer.toString(temp.get(j));
                int com1 = Integer.parseInt(str1 + str2);
                temp2.add(com1);
            }
        }
        System.out.println(temp2);
        ArrayList<Integer> temp3 = new ArrayList<Integer> ();
        for(int i = 1; i < temp.size(); i++)
        {
            String str1 = Integer.toString(temp.get(i));
            for(int j = i-1; j >= 0;j--)
            {
                String str2 = Integer.toString(temp.get(j));
                int com1 = Integer.parseInt(str1 + str2);
                temp3.add(com1);
            }
        }
        System.out.println(temp3);
        temp2.addAll(temp3);
        System.out.println(temp2);*/

        //finding prime numbers from the list of combinations obtained
        ArrayList<Integer> temp4 = new ArrayList<Integer> ();
        for(int i = 0; i<temp2.size();i++)
        {
            int j = 2;
            int flag = 1;
            while(j < temp2.get(i))
            {
                if(temp2.get(i) % j == 0)
                {
                    flag = 0;
                    break;
                }
                j++;
            }
            if (flag == 1)
            {
                temp4.add(temp2.get(i));
            }
        }
        System.out.println(temp4);

        //finding largest and smallest numbers in the list of above obtained prime numbers
        int smallest = temp4.get(0);
        int largest = temp4.get(0);
        for(int i = 1; i < temp4.size();i++)
        {
            if(temp4.get(i) > largest)
            largest = temp4.get(i);
            else if(temp4.get(i) < smallest)
            smallest = temp4.get(i);
        }
        System.out.println(largest);
        System.out.println(smallest);

        //constructing the fibonacci series with above obtained smallest and largest as first and second elements of the series
        //and retrieving the last fibonacci number in the series 
        ArrayList<Integer> temp5 = new ArrayList<Integer> ();
        temp5.add(smallest);
        temp5.add(largest);
        for(int i = 2;i < temp4.size();i++)
        {
            int val = temp5.get(i-2) + temp5.get(i-1);
            temp5.add(val);
        }
        System.out.println(temp5.get(temp5.size()-1));
    }
}