//Accept the string from user and print number of characters presen in string
import java.util.*;

class Program267
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String str = sobj.nextLine();

        System.out.println("Number of characters are : "+str.length());
    }
}