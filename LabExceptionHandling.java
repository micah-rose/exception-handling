package labExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExceptionHandling
{

	public static void main(String[] args)
	{
		try
		{
			int digit = numberFromUser();
			int result = sevenModulusN(digit);
			System.out.printf("7 %% %d = %d", digit, result);
			
		}catch (Exception e)
		{
			System.out.println("A problem occurred: " + e.getMessage());
		}
	}

	private static int numberFromUser()
	{	
		Scanner input = new Scanner(System.in);
		int userIn = 0;
		boolean done = false;
		
		do
		{
			try
			{
				System.out.print("number: ");
				userIn = input.nextInt();				
				done = true;
				
			}catch (InputMismatchException e)
			{
				System.out.println("Please enter a whole number.\n");
				input.nextLine();
				//return numberFromUser(); - USE IF DOING RECURSION, REMOVE DO WHILE
			}
		} while (!done);
		
		return userIn;
	}

	private static int sevenModulusN(int number)
	{
		if(number == 0)
		{
			IllegalArgumentException err = new IllegalArgumentException("Cannot Mod 0");
			throw err;
		}
		return 7 % number;
	}
}