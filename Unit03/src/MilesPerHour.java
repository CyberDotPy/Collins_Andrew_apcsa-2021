//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Collins
//Date - 2/1/21
//Class - Period 3
//Lab  - Unit 3 MilesPerHour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = Math.round(distance/(hours+(minutes/60.0)));
	}

	public void print()
	{
		System.out.printf("%d miles in %d hour and %d minutes = %d MPH.", distance, hours, minutes, (int)mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}