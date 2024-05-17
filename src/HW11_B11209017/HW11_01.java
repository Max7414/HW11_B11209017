package HW11_B11209017;

import java.util.*;

public class HW11_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String result = "";
		String in = Integer.toString(input);

		for (var i = 0; i < in.length(); i++) {
			if (in.charAt(i) == '0') {
				System.out.print("error");
				return;
			}
		}

		for (var i = 0; i < in.length() - 1; i++) {
			if (in.charAt(i) == in.charAt(i + 1)) {
				System.out.print("error");
				return;
			}
		}

		for (var i = 0; i < in.length(); i++) {
			result = result + (char) (Character.getNumericValue(in.charAt(i)) + 'A' - 1);
		}
		if (in.charAt(0) % 2 == 0 && in.charAt(in.length() - 1) % 2 == 0) {
			result += "X";
		}

		if (in.charAt(0) % 2 == 1 && in.charAt(in.length() - 1) % 2 == 1) {
			result += "$";
		}

		System.out.print(result);

	}

}
