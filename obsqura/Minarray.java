import java.util.Scanner;
class Minarray
{
 static void min(int arr[])
{
 int min=arr[0];
 for(int i=1;i<arr.length;i++)
{
   if(min>arr[i])
   min= arr[i];
}
 System.out.println("minimum" +min);
}

 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int a[]=new int[5];
 System.out.println("enter the array");
 for(int i=0;i<a.length;i++)
 {
  a[i]=sc.nextInt();
}
 min(a);
}
}


   