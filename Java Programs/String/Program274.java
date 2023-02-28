//Accept the string from user and print count of digits presen in string
import java.util.*;

class Program274
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}