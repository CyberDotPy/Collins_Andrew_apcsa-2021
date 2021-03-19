//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		Comparable<Word>[] list = new Word[size];
		String[] wordList = new String[size];
		
		for (int i = 0; i < size; i++)
		{
			String word = file.next();
			
			list[i] = new Word(word);
			wordList[i] = word;
		}
		
		for (int k = 0; k < size; k++)
		{
			for (int i = 0; i < size-1; i++)
			{
				int index = list[i].compareTo((Word)list[i + 1]);
				
				if (index > 0)
				{
					Word tmp = new Word(wordList[i]);
					String tmpWord = wordList[i];
					
					wordList[i] = wordList[i+1];
					list[i] = list[i+1];
					list[i+1] = tmp;
					wordList[i+1] = tmpWord;
				}
			}
		}
		
		for (int i = 0; i < size; i++)
			System.out.println(list[i]);
	}
}