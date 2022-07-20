
import java.lang.*;
import java.util.*;

class  Bitwise
{
    public int OffBit(int iNo,int pos)
    {
        int iMask=0x00000001;
        int iResult=0;

        iMask=iMask << (pos-1);
        
        iResult=iNo^iMask;
        return iResult;
    }
}

class assignmentQ126
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("enter number:");
        int value=sobj.nextInt();

        System.out.println("enter position:");
        int pos=sobj.nextInt();

        Bitwise bobj=new Bitwise();  
        int iret=bobj.OffBit(value,pos);

        System.out.println("modified number is:"+iret);
    }
}