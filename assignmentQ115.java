import java.lang.*;
import java.util.*;

class  Bitwise
{
    public boolean ChkBit(int iNo)
    {
        int iMask=0x00004000;
        int iResult=0;
        
        iResult=iNo&iMask;

        if(iResult==0)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}

class assignmentQ115
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("enter number:");
        int value=sobj.nextInt();

        Bitwise bobj=new Bitwise();
        boolean bret=bobj.ChkBit(value);

        if(bret==true)
        {
            System.out.println("bit is on");
        }
        else
        {
            System.out.println("bit is off");
        }
    }
}