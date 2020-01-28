import java.util.*;
import java.io.*;
class Program27
{
public static void main(String args[])
{
if(args.length==0)
{
System.out.println("Please enter an integer number");
}
else
{
for(int i=0;i<=Integer.parseInt(args[0]);i++)
{
for(int j=0;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}

}