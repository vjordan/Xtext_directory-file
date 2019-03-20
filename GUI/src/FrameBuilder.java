import java.util.ArrayList;
import java.util.List;

public class FrameBuilder {

	private String id;
    private String title;
    private Integer width;
    private Integer height;
    private List<Content> contents = new ArrayList<Content>();

    public FrameBuilder button(String name) {
    	Content button = new Content("button", name);
    	this.contents.add(button);
        return this;
    }

    public FrameBuilder label(String name) {
    	Content label = new Content("label", name);
        this.contents.add(label);
        return this;
    }

    public FrameBuilder id(String id) {
        this.id = id;
        return this;
    }

    public FrameBuilder title(String title) {
        this.title = title;
        return this;
    }

    public FrameBuilder width(Integer width) {
        this.width = width;
        return this;
    }

    public FrameBuilder height(Integer height) {
        this.height = height;
        return this;
    }
    
    public Frame getContent() {
        return new Frame(id, title, width, height, contents);
    }
}
