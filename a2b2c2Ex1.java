package ADjava;

public class a2b2c2Ex1 {

	public static void main(String[] args) {

		String s = "abbcdcddcdd";
		char[] c = s.toCharArray();
		int count[] = new int[c.length];

		for (int i = 0; i < s.length(); i++) {
			count[i]++;
			for (int j = i + 1; j < s.length(); j++) {

				if (c[i] == c[j]) {
					c[j] = ' ';
					count[i]++;
				}
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (c[i] != ' ') {
				System.out.print(c[i] + "" + count[i]);
			}
		}
	}
}