//Trim function
import java.util.*;

class Program485
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        String newstr = str.trim();         //It removes the extra white spaces

        String Arr[] = newstr.split(" ");      //split function white space pasun word seperate krt

        System.out.println("Number of words are : "+Arr.length);
    }
}