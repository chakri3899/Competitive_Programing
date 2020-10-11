import java.util.*;

public class HexawarePractice2 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int k = s.nextInt();
        s.close();

        String arr[] = str.split(" ");
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = " " + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        String chunk = "";
        int i = 0;
        int  count = 0;
        ArrayList<String> temp = new ArrayList<String>();
        while(i < arr.length)
        {
            chunk = chunk + arr[i];
            if(i == arr.length - 1 && (chunk.length()+6 <= 17))
            {
                count++;
                temp.add(chunk);
            }
            if((chunk.length() + 6) > k) 
            {
                count++;
                temp.add(chunk);
                chunk = "";
                i--;
            }
            i++;
        }
        System.out.println(count);
        System.out.println(temp);

    }
}
