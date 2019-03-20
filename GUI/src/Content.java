import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Content {

	private final String type;
	private final String title;
	
	public Content(String type, String title) {
		this.type = type;
        this.title = title;
    }
	
	public String toString() {
        StringBuilder result = new StringBuilder(type + ": \"" + title + "\"");
        return result.toString();
    }
	
	public void execute(JFrame jf) {
		if (type=="button") {
			JButton button = new JButton();
	        jf.add(button);
	        button.setText(title);
		} else {
			JLabel label = new JLabel();
	        jf.add(label);
	        label.setText(title);
		}
    }
}
