package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday": 
			System.out.println("Sunday");
			break;
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Taco Tuesday");
			break;
		case "Wednesday":
			System.out.println("Salmon for dinner!");
			break;
		case "Thursday":
			System.out.println("Just one more day before Friday");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "OMG! It's Friday!");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "OMG It's the weekend!");
			break;
		default :
			System.out.println("Tomorrow's Monday!");
			break;
		}
	}
}
