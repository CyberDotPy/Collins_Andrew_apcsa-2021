//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
   public Perfect()
   {
	   setNum(0);
   }
   
   public Perfect(int a)
   {
	   setNum(a);
   }
   
   public void setNum(int a)
   {
	   number = a;
   }

   public boolean isPerfect()
   {
	   int sum = 0;
	   
	   for(int i = 1 ; i < number ; i++)
	   {
			if(number % i == 0)
				sum = sum + i;
	   }
	   
	   if (sum == number)
		   return true;
	   else
			return false;
   }
   
   public String toString()
   {
	   if (isPerfect())
		   return number + " is perfect.\n";
	   else
		   return number + " is not perfect.\n";
   }
}