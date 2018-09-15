
public class EmailValidator {

	public static void main(String[] args) {
		// only one occurences of @ and .
		// min 4 letters before @
		// min 3 letters betweeen @ and .
		// min 2 letters after .
		String email = "abcd@gmail.com";
		int c1 = 0, c2 = 0;
		String bef = email.substring(0, (email.indexOf('@')));
		String bet = email.substring(email.indexOf('@') + 1, email.indexOf('.'));
		String aft = email.substring(email.indexOf('.') + 1);
		/*
		 * System.out.println(bef); System.out.println(bet); System.out.println(aft);
		 */
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@')
				c1++;
			if (email.charAt(i) == '.')
				c2++;
		}

		if (bef.length() > 4 && bet.length() > 3 && aft.length() > 2) {
			System.out.println("invalid");
		} else if (c1 == 1 && c2 == 1)
			System.out.println("valid");

	}

}