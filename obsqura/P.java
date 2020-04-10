import java.util.Scanner;
class P
{
  public static void main(String args[])
{  
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number");
   int a=sc.nextInt();
   All obj=new All();
   obj.drome(a);
}
}


class All
{
  public void drome(int m)
{
  int s=m;
  int sbar=m;
  int rev=0;
  while(s!=0)
{
      int q=s%10;
      rev=(rev*10)+q;
      s=s/10;
}
 if(sbar==rev)
{
  System.out.println("its a pallindrome");
}
else
{ 
  System.out.println("not a pallindrome");
}
}
}
  