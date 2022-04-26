package codingTest;

import java.util.Scanner;

public class No_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		String[] array = line.split(" ");
		String buffer = array[0];
		for(int i= 1;i<array.length;i++) {
			if(array[i].length()>buffer.length()) {
				buffer = array[i];
			}
		}
		
		System.out.println(buffer);
	}
}
