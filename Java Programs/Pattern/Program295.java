//Pattern printing
/*
    input : Hello

    Output : 

        H   E   L   L   O
        H   E   L   L   O
        H   E   L   L   O
        H   E   L   L   O
        H   E   L   L   O
*/
import java.util.*;

class Pattern
{
    public void Display(String str)
    {
       char Arr[] = str.toCharArray();
       int i = 0, j = 0;

       for(i = 0; i < Arr.length; i++)
       {
            for(j = 0; j< Arr.length;j++)
            {
                System.out.print(Arr[j]+"\t");
            }
            System.out.println();
       }
    }
}

class Program295
{
    public static void main(String A[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string :");
        String s = sobj.nextLine();

       pobj.Display(s);

    }
}