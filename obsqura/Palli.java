import java.util.Scanner;
class Palli
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number");
 int a=sc.nextInt();
 Drome obj=new Drome();
 obj.reverse(a);
  }
}
     

class Drome
{
  public void reverse(int b)
{

  int sbar=b;
  int s=b;
  int rev=0;
  
while(s!=0)
{
  int q=s%10;
  rev=(rev*10)+q;
  s=s/10;
}

if(sbar==rev)
{
System.out.println("It is palindrome");
}
else
{
System.out.println("Its not a palindrome");
}
}
}