import java.net.URISyntaxException;
import java.nio.file.Paths;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Boxes {

	public static int optionBox(Object[] options, int numOfOptions,
			String topOfBox, String text, javax.swing.JFrame frame)
			throws URISyntaxException {

		Icon icon = iconGet();

		int n = JOptionPane.showOptionDialog(frame, text, topOfBox,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
				icon, options, "");

		return n;

	}// optionBox(Object[], int, String, String)

	public static Icon iconGet() throws URISyntaxException {

		String[] pathNames = { "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
				"20", "21", "22" };
		int index = (int) (Math.random() * pathNames.length);

		java.nio.file.Path imgPath = Paths.get("Fred/icon" + pathNames[index]
				+ ".jpg");

		Icon icon = new ImageIcon(imgPath.toAbsolutePath().toString());
		return icon;

	}// IconGet

	public static void errorBox(String reason) throws Exception {
		javax.swing.JFrame frame = new javax.swing.JFrame();
		Icon icon = iconGet();
		JOptionPane.showMessageDialog(frame, reason, "Please try again.",
				JOptionPane.ERROR_MESSAGE, icon);

	}// errorBox(String)
	
	

	public static void messageBox(String message, String title,
			javax.swing.JFrame frame) throws URISyntaxException {
		Icon icon = iconGet();
		JOptionPane.showMessageDialog(frame, message, title,
				JOptionPane.PLAIN_MESSAGE, icon);
	}// messageBox(String, String)

}
