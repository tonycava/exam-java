public class Manga implements Category {

	private String name = "Manga";

	private String nativeCountry = "Japon";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getNativeCountry() {
		return nativeCountry;
	}
}
