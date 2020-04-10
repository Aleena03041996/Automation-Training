import java.util.Scanner;
class Met
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the value of a");
 System.out.println("enter the value of b");
 int a=sc.nextInt();
 int b=sc.nextInt();
 All obj=new All();
 obj.addition();
 int d=obj.subtraction();
 System.out.println("Difference is"+d);
 obj.multiplication(a,b);
 int f=obj.division(a,b);
 System.out.println("quotient is"+f);
}
}

class All
{
 int a,b,c;
 Scanner sc=new Scanner(System.in);
 
public void addition()
{
 int c;
 System.out.println("enter the value of a");
 System.out.println("enter the value of b");
 int a=sc.nextInt();
 int b=sc.nextInt();
 c=a+b;
 System.out.println("Sum is"+c);
}



public int subtraction()
{
 int c;
 System.out.println("enter the value of a");
 System.out.println("enter the value of b");
 int a=sc.nextInt();
 int b=sc.nextInt();
 c=a-b;
 return c;
}



public void multiplication(int i,int j)
{2
 int c;
 a=i;
 b=j;
 c=a*b;
 System.out.println("Product is"+c);
}


 
 public int division(int i,int j)
{
  int c;
  a=i;
  b=j;
  c=a/b;
  return c;
} 
}