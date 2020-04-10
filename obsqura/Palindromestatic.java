class Palindromestatic
  {
     static int temp;
     static int rev=0;
     static int rem;

     public static void reverse(int n)
       {
         while(n!=0)
           {
             
             rev=(rev*10)+rem;
             n=n/10;
           }
       }

   public static void check()
           {
              if(temp==rev)
                {
                  System.out.println("number is palindrome");
                 }
              else
                {
                   System.out.println("number is not palindrome");
                }
           }

   public static void main(String args[ ])
               {
                  Palindromestatic.reverse(121);
                  Palindromestatic.check();
               }
  }