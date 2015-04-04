//	Main_TryParseString.java by Kyle Wolff and Brandon VanderMey

import javax.swing.JOptionPane;

public class Main_TryParseString
{
	public static void main(String[] args)
	{
		boolean validData = false;
		
		while (!validData)
		{
			try
			{
				String userInput = JOptionPane.showInputDialog(null, "Enter number: ");
				int userNumber = Integer.parseInt(userInput);
				JOptionPane.showMessageDialog(null, "Your number: " + userNumber);
				validData = true;
			}
			
			catch (NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, "Entry cannot be converted to number.");
			}
		}
	}
}
