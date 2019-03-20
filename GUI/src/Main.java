import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Output of beautiful method:");
		System.out.println(buildGuiBeautiful());
		System.out.println("\n");
		System.out.println("Output of ugly method:");
		buildGuiUgly();
	}
	
	private static void buildGuiUgly(){
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame A = new JFrame();
				A.setLayout(new FlowLayout());
				A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				A.setTitle("Frame A");
				A.setSize(200, 100);
				JLabel label0 = new JLabel();
				A.add(label0);
				label0.setText("Hello");
				JButton button1 = new JButton();
				A.add(button1);
				button1.setText("World!");
				A.setVisible(true);
				System.out.println(A);
			}
		});
	}
	
	private static Frame buildGuiBeautiful(){
		
		FrameBuilder frameBuilder = new FrameBuilder();

		frameBuilder
    		.id("A")
    		.title("Frame A")
    		.width(200)
    		.height(100)
    		.label("Hello")
    		.button("world!")
    	;

		Frame frame = frameBuilder.getContent();
		frame.execute();
		
		return frame;
	}
}
