
class Book {
	String name;
	String writer;
	int pages;
	
	Book(String name, String writer, int pages){
		this.name=name;
		this.writer=writer;
		this.pages=pages;
	}

	public String getName() { return this.name;}
	public String getWriter() { return this.writer;}
	public int getPages() { return this.pages;}
	public String toString() {
		return "제목: "+ this.getName()+ ", 저자: "+ this.getWriter() ;
	}
}
