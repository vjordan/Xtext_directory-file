import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame {

	private final String id;
    private final String title;
    private final Integer width;
    private final Integer height;
    private final List<Content> contents;

    public Frame(String id, String title, Integer width, Integer height, List<Content> contents) {
        this.id = id;
        this.title = title;
        this.width = width;
        this.height = height;
        this.contents = contents;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("frame " + id + " {" + "\n"
                + "\ttitle: \"" + title + "\"\n"
                + "\twidth: " + width + "\n"
                + "\theight: " + height + "\n"
                + "\tcontent { \n");

        for (Content content: contents) {
            result.append("\t\t").append(content.toString()).append("\n");
        }

        result.append("\t}\n").append("}");

        return result.toString();
    }
    
    public void execute() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame A = new JFrame();
                A.setLayout(new FlowLayout());
                A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                A.setTitle(title);
                A.setSize(width, height);
                for(Content content: contents) {
                    content.execute(A);
                }
                A.setVisible(true);
            }
        });
    }
}
