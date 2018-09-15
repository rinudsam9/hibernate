public class Book {
	private String title;
	private Member member;

	public Book(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}



	public void status() {
		if(member==null)
			System.out.println("book not issued to anyone");
		else
			System.out.println("nook issued to"+member.getName());
	}

	public void issueBook(Member mbr) {
		mbr.setName(title);
		this.member=mbr;
		System.out.println(title+"issued to "+mbr.getName());
	}
  public void returnBook(Member mbr) {
	  mbr.setBook(null);
	  this.member=null;
	  System.out.println(title+"returned by "+mbr.getName());
  }
}
