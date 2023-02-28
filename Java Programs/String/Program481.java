//COnvert Uppercase to lower case
import java.util.*;

class Program481
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
    }
}