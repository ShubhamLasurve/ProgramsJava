//Accept the string from user and print characters presen in string
import java.util.*;

class Program268
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String str = sobj.nextLine();

        for(int i =  0;i <str.length();i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}