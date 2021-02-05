//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
	private static String vowels = "aeiou";
	
	public static String go( String a )
	{
		a = a.toLowerCase();
		
		//checks the first and last chars in the string a to see if they are equal to a vowel
		for (int i = 0; i < 5; i++)
			if (a.charAt(0) == vowels.charAt(i) || a.charAt(a.length()-1) == vowels.charAt(i))
				return "yes";
		return "no";
	}
}