package OpS_3rd;

import java.util.Scanner;

public class Chartorial_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		char c = s.charAt(0);
		
		for(char a = c;a >= 'a';a = (char)(a-1)) {
			for(char b = 'a';b <= a;b = (char)(b+1)) {
				System.out.print(b);
			}
			System.out.println();
		}
		
		
		scanner.close();

	}

}
