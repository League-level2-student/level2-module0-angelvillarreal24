/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	JFrame window;
	JPanel panel;
	JButton[] buttonArray;

	// 1. create an array of JButtons. Don't initialize it yet.
	// 2 create an int variable called hiddenButton

	int hiddenButton = 0;

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3

		String stringToInt = JOptionPane.showInputDialog("give positive number now");
		int parceResult = Integer.parseInt(stringToInt);
		buttonArray = new JButton[parceResult];

		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel

		for (int i = 0; i < parceResult; i++) {
			buttonArray[i] = new JButton();
			buttonArray[i].addActionListener(this);
			panel.add(buttonArray[i]);
		}

		// 9 add the panel to the window

		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.

		window.setExtendedState(JFrame.MAXIMIZED_BOTH);

		// 11. set the JFrame to visible.

		window.setVisible(true);
		window.pack();
		// 12. Give the user the instructions for the game.

		JOptionPane.showMessageDialog(null, "Objective: Find the hidden button and press it");

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3

		Random randy = new Random();
		int randomNumber = randy.nextInt(parceResult);
		hiddenButton = randomNumber;

		// 14. Set the text of the JButton located at hiddenButton to "ME"

		buttonArray[hiddenButton].setText("ME");
		window.pack();
		
		// 15. Use Thread.sleep(1000); to pause the program.
		// Surround it with a try/catch - use Eclipse helper for this

		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println("bruh what did you do");
		}

		// 16. Set the text of the JButton located at hiddenButton to be blank.

		buttonArray[hiddenButton].setText("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.

		if (buttonClicked == buttonArray[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "YOU WIN!!!!!!");
			System.exit(0);
		} else {
			JOptionPane.showMessageDialog(null, "YOU LOSE!!!");
			System.exit(0);
		}
		// 18. else tell them to try again
	}
}
