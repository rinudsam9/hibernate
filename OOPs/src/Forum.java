import java.util.Vector;



public class Forum {
	private String topic;
	//private Post[] posts;
	private int idx;
	protected Vector<Post> posts;

	public Forum() {

	}

	public Forum(String topic) {
		this.topic = topic;
		posts=new Vector<>();
	}

	public void addPost(Post post) {
		posts.addElement(post);
	}

	public void showPosts() {
		System.out.println(posts.size() + "posts in forum topic:" + topic);
		/*for (int i = 0; i < idx; i++) {
			System.out.println();
			posts[i].printReplies();}*/
		for (Post elem : posts)
			elem.printReplies();
		
	}

}
