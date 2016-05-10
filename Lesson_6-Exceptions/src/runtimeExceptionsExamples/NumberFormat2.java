package runtimeExceptionsExamples;

import javax.swing.JOptionPane;

public class NumberFormat2 {

	public static void main(String[] args) {

		try {
			//Opens a window with an input field from the keyboard and stores the input as a String. 
			String str1 = JOptionPane.showInputDialog("Enter num 1");
			
			//Attempts to parse the given string input to an integer. If the input is not a string of digits characters only
			//a NumberFormatException will be thrown.
			int a = Integer.parseInt(str1);
			
			//Same as above.
			String str2 = JOptionPane.showInputDialog("Enter num 2");
			int b = Integer.parseInt(str2);
			
			int sum = a + b;
			System.out.println(a + " + " + b + " = " + sum);

		} catch (NumberFormatException e) {
			//NumberFormatException is caught.
			System.out.println("error - wrong input");
			System.out.println(e.getMessage()); //"For input string: ?" is printed.
			
			//The exception's stack trace is printed. By using the "System.out" as a parameter is the parenthesis, the stack trace
			//is printed to the console in the order of the other printing. Without it, the stack trace could have been printed out
			//any where regardless of the printing order.
			e.printStackTrace(System.out); 
			
//			return; //If  this was uncommented, the printing of "end of main" would not have been executed since this return refers to main.
		} catch (Exception e) {
			//Any other exception is caught and the message is printed.
			System.out.println("error - some other problem");
		} finally { 
			//This block is being executed weather an exception was thrown or the 'try' catch block ended successfully. Used to close resources
			System.out.println("from finally"); //This is printed anyway.

		}

		//This is being executed anyway since if an exception is thrown it is caught and handled by the catch block and after the finally 
		//block is done, main continues to run.
		System.out.println("end of main");

	}
}
