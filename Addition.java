import java.util.Scanner;
class Add
{
    void sum()
    {
 int a;
 int b;
 int c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
a=sc.nextInt();
System.out.println("Enter the another number");
b=sc.nextInt();
c=a+b;
System.out.println("Result is"+c);
    }
}
class Addition
{
    public static void main(String args[])
    {
        Add ob=new Add();
        ob.sum();
    }
}