package leetcode;

import java.util.regex.Pattern;

public class leet65 {
	public static boolean isNumber(String s) {
		if (Pattern.matches("^[+-]?(\\d+(\\.\\d*)?|\\.\\d+)([eE][+-]?\\d+)?$", s)) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		System.out.println(isNumber("0"));
		System.out.println(isNumber("e"));
		System.out.println(isNumber("."));
	}
}

// 
