//print  1
//       2 2
//       3 3 3
//       4 4 4 4
//       5 5 5 5 5
//       4 4 4 4
 //      3 3 3
//       2 2
//       1
class Pattern3
{
  public static void main(String args[])
{
    for(int i=1;i<6;i++)
       {
            for(int j=1;j<=i;j++)
                {
                    System.out.print(i);
                }
            System.out.println();
      }
     for(int p=4;p>=1;p--)
                 {
                    for(int q=1;q<=p;q++)
                  {
                       System.out.print(p);
                 }
            System.out.println();
}
}
 }   