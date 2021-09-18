package OpS_3rd;

import java.util.Scanner;

public class Exchange_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int money = scanner.nextInt();
		int a;
		
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		
		
		for(int i = 0;i < unit.length;i++) {
			a = money/unit[i];
			if(a != 0) {
				System.out.print(unit[i] + "원 짜리 : " + a + "개");
				System.out.println();
			}			
			money = money%(unit[i]);			
		}		
		scanner.close();
	}

}
