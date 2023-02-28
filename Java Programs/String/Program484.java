//Split function
import java.util.*;

class Program484
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        String Arr[] = str.split(" ");      //split function white space pasun word seperate krt

        System.out.println("Number of words are : "+Arr.length);
    }
}