//palindrome
import java.util.Scanner;
class Palindrome1
{
   public static void main(String args[])
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the number");
          int n=sc.nextInt();
          int sum=0;
          int i=n;
          int j=n;
          while(i!=0)
{
            sum=(sum*10)+i%10;
            i=i/10;
}
    if(sum==j)
        {
           System.out.println("palindrome");
        }
  else
{
          System.out.println("not palindrome");
}
}
}
 
            
          
   
