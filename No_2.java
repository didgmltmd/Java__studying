package codingTest;

import java.util.Scanner;

public class No_2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String word = sc.nextLine();
	
	for(int i = 0;i<word.length();i++) {
		if(Character.isUpperCase(word.charAt(i))) {
			System.out.print(Character.toLowerCase(word.charAt(i)));
		}
		else {
			System.out.print(Character.toUpperCase(word.charAt(i)));
		}
	}
}

}
