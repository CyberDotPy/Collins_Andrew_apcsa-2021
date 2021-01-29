//© A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Collins
//Date - 1/28/21
//Class - Period 3
//Lab  - Unit 1 StarsAndStripes

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
      printTwentyDashes();
      printTwentyStars();
      printTwentyStars();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyStars();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyStars();
      printTwentyStars();
      printTwentyDashes();
   }

   public void printTwentyStars()
   {
	   out.println("********************");
   }

   public void printTwentyDashes()
   {
	   out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
	   out.println("\n\n");
   }
   
   public void printASmallBox()
   {	
	   out.println("---");
	   out.println("| |");
	   out.println("---");
   }
 
   public void printABigBox()
   { 	
	   out.println("-------");
	   out.println("|     |");
	   out.println("|     |");
	   out.println("|     |");
	   out.println("-------");
   }   
}