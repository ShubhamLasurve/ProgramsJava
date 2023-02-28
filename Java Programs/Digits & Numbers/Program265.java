//Accept N numbers and store it into array and check whether the array is palindrome or not
import java.util.*;

class ArrayX
{
    protected int Arr[];

    public ArrayX(int iSize)
    {
        Arr = new int[iSize];
    }  

    protected void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please enter " +Arr.length + " elements");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter thr element no : "+ (iCnt + 1));
            Arr[iCnt] = sobj.nextInt();
        }
    } 

    protected void Display()
    {
        System.out.println("Elements of array are :");

        for(int iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
        System.out.println();
    }
}

class MarvellousX extends ArrayX
{
    public MarvellousX(int iSize)
    {
        super(iSize);
    }

    public boolean CheckPalindrome()
    {
        int iStart = 0;
        int iEnd = Arr.length-1;
        boolean bFlag = true;

        while(iStart < iEnd)
        {
            if(Arr[iStart] != Arr[iEnd])
            {
                bFlag = false;
                break;
            }
            iStart++;
            iEnd--;
        }
        return bFlag;
    }

}

class Program265
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create");

        int iSize = sobj.nextInt();

        MarvellousX obj = new MarvellousX(iSize);

        obj.Accept();

        obj.Display();

        boolean bRet = obj.CheckPalindrome();

        if(bRet == true)
        {
            System.out.println("The given array is palindrome");
        }
        else
        {
            System.out.println("The given array is not palindrome");
        }
    }
}