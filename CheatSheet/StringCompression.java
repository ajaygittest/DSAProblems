package DSA.DSAProblems;

public class StringCompression {

	public static int compress(String s) {

		char[] c = s.toCharArray();

		int write = 0;
		int read = 0;

		while (read < s.length()) {
			int count = 0;
			char currentChar = c[read];

			while (count < s.length() && c[read] == c[currentChar]) {
				read++;
				count++;

			}
			c[write++] = currentChar;

			if (count > 1) {

				for (char d : Integer.toString(count).toCharArray()) {
					c[write++] = d;
				}
			}

		}
		return read;
	}

}
