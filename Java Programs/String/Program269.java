//Accept the string from user and print  characters presen in string
import java.util.*;


class MarvellousX
{
    public void Display(String s)
    {
        for(int i = 0; i < s.length();i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}
class Program269
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        MarvellousX obj = new MarvellousX();
        obj.Display(str);
    }
}