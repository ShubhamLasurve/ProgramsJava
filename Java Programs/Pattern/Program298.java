//Pattern printing
/*
    input : 4529

    Output : 

       9    2   5   4
       9    2   5   4
       9    2   5   4
       9    2   5   4
*/
import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iDigit = 0;
        int iTemp1 = iNo;
        int iTemp2 = iNo;

        while(iTemp1 != 0)
        {
            while(iTemp2 != 0)
            {
                iDigit = iTemp2 % 10;
                System.out.print(iDigit+"\t");
                iTemp2 = iTemp2 / 10;
            }
            iTemp2 = iNo;
            
            System.out.println();
            iTemp1 = iTemp1 / 10;
        }
        
    }
}

class Program298
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