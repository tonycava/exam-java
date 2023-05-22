public class Novel implements Category {

	private String name = "Roman";

	private String nativeCountry = "France";

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getNativeCountry() {
		return nativeCountry;
	}
}
