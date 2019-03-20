
public class ContentBuilder {

	private String type;
	private String title;
	
	public ContentBuilder type(String type) {
        this.type = type;
        return this;
    }
	
	public ContentBuilder title(String title) {
        this.title = title;
        return this;
    }
}
