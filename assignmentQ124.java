import java.lang.*;
import java.util.*;

class  Bitwise
{
    public int ChkBit(int iNo)
    {
        int iMask=0x0000000F;
        int iResult=0;
        
        iResult=iNo|iMask;
        return iResult;
    }
}

class assignmentQ124
{
    public static void main(String arr[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("enter number:");
        int value=sobj.nextInt();

        Bitwise bobj=new Bitwise();  
        int iret=bobj.ChkBit(value);
        System.out.println("modified number is:"+iret);
    }
}