import java.util.Vector;

public class Post {
	private String feed;
	//private Reply[] replies;
	private int idx;
	protected Vector<Reply> replies;
	public Post() {

	}

	public Post(String feed) {
		this.feed = feed;

		//replies = new Reply[10];
		replies=new Vector<>();
	}

	public void addReply(Reply reply) {

		//replies[idx++] = reply;
		replies.addElement(reply);

	}

	public void printReplies() {
		System.out.println("Post: " + feed + " [Replies: " + replies.size() + "]");
		/*for (int i = 0; i < idx; i++)
			System.out.println(i + 1 + ")" + replies[i]);*/
		for (Reply elem : replies)
			System.out.println(elem);
	}
}