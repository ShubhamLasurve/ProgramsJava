//Count small characters into string
//Loop editing (for cha jagi while or for each and vise versa)
//Using while each loop
import java.util.*;

class Program480
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();        //This will convert string into array

        System.out.println(str.length());
        System.out.println(Arr.length);

        int Count = 0;

        int i =0;
        while(i < Arr.length)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Count++;
            }
            i++;
        }

        System.out.println("Small characters are : "+Count);
    }
}