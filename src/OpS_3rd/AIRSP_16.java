package OpS_3rd;

import java.util.Scanner;

public class AIRSP_16 {

	public static void main(String[] args) {
		
		int[][] resultcode = {{0,-1,1},{1,0,-1},{-1,1,0}};
		String[] str = {"가위", "바위", "보"};
		String player = "";
		String result = "";
		int Pcode = 99;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
		
		while(!player.equals("그만")) {
			Pcode = 99;
			System.out.print("가위~바위~보! >>> ");
			player = scanner.next();
			for(int i = 0; i < 3; i++) {
				if(str[i].equals(player))
					Pcode = i;
			}
			if(Pcode == 99)
				break;
			
			int Ccode = (int)(Math.random()*3);
			
			switch(resultcode[Pcode][Ccode]) {
			case 1:
				result = "사용자가 이겼습니다.";
				break;
			case 0:
				result = "비겼습니다.";
				break;
			case -1:
				result = "컴퓨터가 이겼습니다.";
				break;
			default:
				break;
			}
			
			System.out.print("사용자 = " + player + ", 컴퓨터 = " + str[Ccode] + ", " + result + '\n');
			
		}
		
		
		
		
		
		
		
		scanner.close();

	}

}
