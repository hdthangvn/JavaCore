package chapter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Video42 {
	public static void main(String[] args) {
		Pattern pa = Pattern.compile("[0-9]{6,}");
		Matcher ma = pa.matcher("123456");
		System.out.println("Input String matches regex - " + ma.matches());
	}
}
