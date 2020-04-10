//print     1         
 //       2 2
//      3 3 3
class Pattern1
{
  public static void main(String args[])
{
   for(int i=1;i<4;i++)
          {
               for(int j=3;j>i;j--)
                    {
                      System.out.print(" " );
                    }
                for(int p=1;p<=i;p++)
                    {
                       System.out.print(i);
                     }
              System.out.println();
           }
}
}
  