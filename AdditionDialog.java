import javax.swing.JOptionPane;

public class AdditionDialog
{
	public static void main(String[] args)
	{
		String name1;
		String name2;
		String message;
		int number1;
		int number2; 
		int sum;

		name1 = JOptionPane.showInputDialog("Enter first number: ");
		name2 = JOptionPane.showInputDialog("Enter second number2: ");


		number1 = Integer.parseInt(name1);
		number2 = Integer.parseInt(name2);

		sum = number1 + number2;

		message =
 String.format("Sum of both numbers is, %s", sum);

		JOptionPane.showMessageDialog(null, message); 

	}
}