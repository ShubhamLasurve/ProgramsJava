//COnvert Uppercase to lower case
import java.util.*;

class Program482
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();        //This will convert string into array

        for(int i = 0;i< Arr.length; i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                Arr[i] = (char)(Arr[i] + 32);       //Explicite typecasting
            }
        }

        String output = Arr.toString();     //Array la string madhe convert kel

        System.out.println(output);
    }
}