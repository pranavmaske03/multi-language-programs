
import java.util.*;

class Number
{
    public int iNo;

    public Number(int X)
    {
        iNo = X;
    }

    public int Factorial()
    {
        int iFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(int iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
    }
}

class program6
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number :");
        int iValue = sobj.nextInt();

        Number obj = new Number(iValue);

        System.out.println("Factorial is : "+obj.Factorial());
    }
}