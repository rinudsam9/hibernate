
public class Member {
	private String name;
	private Book book;

	public Member(String name) {
		this.name = name;
	}



	public String getName() {
		return name;
	}
    


	public void setName(String name) {
		this.name = name;
	}



	public Book getBook() {
		return book;
	}



	public void status() {
		if(book==null)
			System.out.println("Member has not issued any book");
		else
			System.out.println("not issued"+book.getTitle());
	}


	public void setBook(Book title) {
		
		
		
	}
	
	
}
