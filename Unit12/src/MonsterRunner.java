//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st monster's name : ");
		String nameOne = keyboard.next();
		
		System.out.println("Enter 1st monster's size : ");
		int sizeOne = keyboard.nextInt();
		
		//instantiate monster one
		Monster monsterOne = new Skeleton(nameOne, sizeOne);
		
		//ask for name and size
		System.out.println("Enter 2nd monster's name : ");
		String nameTwo = keyboard.next();
		
		System.out.println("Enter 2nd monster's size : ");
		int sizeTwo = keyboard.nextInt();
		
		//instantiate monster two
		Monster monsterTwo = new Skeleton(nameTwo, sizeTwo);
		
		//print monsters
		System.out.println("\nMonster 1 - " + monsterOne);
		System.out.println("Monster 2 - " + monsterTwo + "\n");
		
		//compare monsters
		if(monsterOne.isBigger(monsterTwo))
			System.out.println("Monster one is bigger than Monster two");
		else 
			System.out.println("Monster one is smaller than Monster two");
		
		if(monsterOne.namesTheSame(monsterTwo))
			System.out.println("Monster one has the same name as Monster two");
		else
			System.out.println("Monster one does not have the same name as Monster two");
	}
}