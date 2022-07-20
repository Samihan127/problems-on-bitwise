
import java.lang.*;
import java.util.*;

class  Bitwise
{
    public boolean ChkBit(int iNo,int pos)
    {
        int iMask=0x00000001;
        int iResult=0;

        iMask=iMask << (pos-1);
        
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

class assignmentQ125
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("enter number:");
        int value=sobj.nextInt();

        System.out.println("enter position:");
        int pos=sobj.nextInt();

        Bitwise bobj=new Bitwise();  
        boolean bret=bobj.ChkBit(value,pos);

        if(bret==true)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}