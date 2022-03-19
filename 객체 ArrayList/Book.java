
class Book {
	String name;
	String writer;
	
	Book(String name, String writer){
		this.name=name;
		this.writer=writer;
	}
	public String getName() { return this.name;}
	public String getWriter() { return this.writer;}
	public String toString() {
		return "제목: "+ this.getName()+ ", 저자: "+ this.getWriter() ;
	}
}
