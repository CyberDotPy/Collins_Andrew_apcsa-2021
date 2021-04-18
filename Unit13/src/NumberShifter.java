//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array(int size)
	{
		int[] ray = new int[size];
		
		for (int i = 0; i < size; i++)
			ray[i] = (int)(Math.random() * 10 + 1);
		
		return ray;
	}
	public static void shiftEm(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 7) {
				for (int j = 0; j < array.length; j++)
				{
					if (array[j] != 7)
					{
						array[i] = array[j];
						array[j] = 7;
						
						break;
					}
				}
			}
		}
	}
}