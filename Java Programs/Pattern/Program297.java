//Pattern printing
/*
    input : 4529

    Output : 

       9    2   5   4
*/
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iDigit = 0;
       
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit+"\t");
            iNo = iNo / 10;
        }
    }
}

class Program297
{
    public static void main(String A[])
    {
        Pattern pobj = new Pattern();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int i = sobj.nextInt();

       pobj.Display(i);

    }
}