//Convert String to array
import java.util.*;

class Program477
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();        //This will convert string into array

        System.out.println(str.length());
        System.out.println(Arr.length);
    }
}