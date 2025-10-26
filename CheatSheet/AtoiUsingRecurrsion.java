package Own;

public class AtoiUsingRecurrsion {

	public static int checkAtoi(String s) {

		s = s.trim();
		if (s.isEmpty())
			return 0;

		int index = 0;
		int sign = 1;

		if (s.charAt(0) == '-') {
			sign = -1;
			index++;
		} else if (s.charAt(0) == '+') {
			index++;
		}

		return (int) helper(s, index, 0L, sign);
	}

	private static long helper(String s, int index, long acc, int sign) {
		if (index >= s.length())
			return acc * sign;

		char c = s.charAt(index);
		if (!Character.isDigit(c))
			return acc * sign;

		int digit = c - '0';

		if (sign == 1 && acc > (Integer.MAX_VALUE - digit) / 10)
			return Integer.MAX_VALUE;
		if (sign == -1 && acc > ((long) Integer.MAX_VALUE + 1 - digit) / 10)
			return Integer.MIN_VALUE;

		long newAcc = acc * 10 + digit;
		return helper(s, index + 1, newAcc, sign);
	}

}
