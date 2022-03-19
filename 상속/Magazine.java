
class Magazine extends Book{
	String release;
	Magazine(String name, String writer, int pages, String release) {
		super(name, writer, pages);
		this.release=release;
	}
	public String getRelease() { return this.release; }
}
