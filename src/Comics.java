public class Comics implements Category {
	private String name = "Comics";

	private String nativeCountry = "Etats-Unis";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getNativeCountry() {
		return nativeCountry;
	}
}
