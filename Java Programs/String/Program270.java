//Accept the string from user and print count of small characters presen in string
import java.util.*;


class MarvellousX
{
    public int SmallCount(String s)
    {
        int iCnt = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= 'a') && (s.charAt(i) <='z'))
            {
                iCnt++;
            }
         }
        return iCnt;
    }
}
class Program270
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String");
        String str = sobj.nextLine();

        MarvellousX obj = new MarvellousX();
        
        int iRet = obj.SmallCount(str);
        System.out.println("Number of small case letters are : "+iRet);
    }
}