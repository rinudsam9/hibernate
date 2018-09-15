
public class TestForum {
	public static void main(String[] args) {
		Forum java = new Forum("Java");
		Post p1 = new Post("What is java??");
		p1.addReply(new Reply("Oobject oriented"));
		p1.addReply(new Reply("Platform Independent"));
		java.addPost(p1);

		Post p2 = new Post("New features in Java??");
		p2.addReply(new Reply("Lambda expressions"));
		p2.addReply(new Reply("Default methods"));
		p2.addReply(new Reply("Improved collection"));
		java.addPost(p2);
		java.showPosts();

	}
}
