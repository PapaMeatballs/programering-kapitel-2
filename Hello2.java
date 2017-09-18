import javax.swing.*;

public class Hello2 {
	public static void main (String[] arg) {
		String name;
		String lastname;
		String greetings;
		name = JOptionPane.showInputDialog("Tell me your name or I will sniff your chest hair!"); //första dialogrutan. (frågar efter namn)
		lastname = JOptionPane.showInputDialog("I need your last name too, otherwise I might have to wrestle you. And you don't want that, trust me."); //andra dialogrutan. (efternamn)
		greetings = "Thanks, now your chest hair is safe once again " + name + " " + lastname + "."; //sista dialogrutan.
		JOptionPane.showMessageDialog(null, greetings);
	}
}