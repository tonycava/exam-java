public class Writer extends Author {
	private String style;

	public Writer(String name, String firstName) {
		super(name, firstName);
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
}
