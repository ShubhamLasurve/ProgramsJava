//Addition of two Numbers

import java.util.*;     //For Scanner class

class Program247
{
    static int Addition(int i, int j)
    {
        int Sum = 0;
        Sum = i + j;
        return Sum;
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        int iNo1 = 0, iNo2 = 0, iAns = 0;

        System.out.println("Enter the first number");
        iNo1 = sobj.nextInt();

        System.out.println("Enter the second number");
        iNo2 = sobj.nextInt();

        iAns = Addition(iNo1, iNo2);

        System.out.println("Addition is : "+iAns);
    }
}