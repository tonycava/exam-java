public class Designer extends Author {
	private String artType;

	public Designer(String name, String firstName) {
		super(name, firstName);
	}

	public String getArtType() {
		return artType;
	}

	public void setArtType(String artType) {
		this.artType = artType;
	}
}
