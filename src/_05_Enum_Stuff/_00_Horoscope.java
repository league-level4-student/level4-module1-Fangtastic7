package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category
	// for
	// all 12 zodiac signs. kk

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane
	// to display
	// a different horoscope based on the Zodiac's state.
	static void intakeZodiac(Zodiac object) {
		switch (object) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "You will be strong and mighty!");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "What is a Taurus?");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "Gemini in your dreams!");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "you have cancer");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "let me guess, you have a cousin named LEO?");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Virgo is the dating website for virgins to find a mate");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "This rhymes with Debra and Zebra");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "You can see this in the stars");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "Random thing");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Fishy");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Last but not least, uh?");
			break;
		}
	}

	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac[] options = { Zodiac.ARIES, Zodiac.TAURUS, Zodiac.GEMINI, Zodiac.CANCER, Zodiac.LEO, Zodiac.VIRGO, 
				Zodiac.LIBRA, Zodiac.SCORPIO, Zodiac.SAGITTARIUS, Zodiac.CAPRICORN, Zodiac.AQUARIUS, Zodiac.PISCES};
	
		int object = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);
		
		Zodiac zodiac = options[object];
		intakeZodiac(zodiac);
		
		
		
	}
}
