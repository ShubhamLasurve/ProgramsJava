//Count small characters into string
//Loop editing (for cha jagi while or for each and vise versa)
//Using for each loop
import java.util.*;

class Program479
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

        for(char Ch : Arr)
        {
            if((Ch >= 'a') && (Ch <= 'z'))
            {
                Count++;
            }
        }

        System.out.println("Small characters are : "+Count);
    }
}