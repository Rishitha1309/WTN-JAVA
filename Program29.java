import java.util.*;
class Program29
{
public static void main(String args[])
{
int factorial=1,i=1;
if(args.length==0)
{
System.out.println("Please enter an integer number");
}
else
do
{
  factorial = factorial * i;
  i++;
} while (i <= Integer.parseInt(args[0]));

System.out.println("Factorial is: " + factorial);
}
}