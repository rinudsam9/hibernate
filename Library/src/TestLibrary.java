
public class TestLibrary {

	
	public static void main(String[] args) {
		Book bk = new Book("origin");
		Member mbr = new Member("Sarvesh");
		bk.status();
		mbr.status();
		bk.issueBook(mbr);
		bk.returnBook(mbr);
	}
	
}
