//Trim function
import java.util.*;

class Program486
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        String data = str.replaceAll("\\s+"," ");   //It replaces more than 1 white spaces to 1 white space in the middle of string

        String newstr = data.trim();         //It removes the extra white spaces     //trim ne madhlya white spaces jat nahi fakt start kiva shevat chya jatat

        String Arr[] = newstr.split(" ");      //split function white space pasun word seperate krt

        System.out.println("Number of words are : "+Arr.length);
    }
}