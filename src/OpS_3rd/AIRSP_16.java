package OpS_3rd;

import java.util.Scanner;

public class AIRSP_16 {

	public static void main(String[] args) {
		
		int[][] resultcode = {{0,-1,1},{1,0,-1},{-1,1,0}};
		String[] str = {"����", "����", "��"};
		String player = "";
		String result = "";
		int Pcode = 99;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�.");
		
		while(!player.equals("�׸�")) {
			Pcode = 99;
			System.out.print("����~����~��! >>> ");
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
				result = "����ڰ� �̰���ϴ�.";
				break;
			case 0:
				result = "�����ϴ�.";
				break;
			case -1:
				result = "��ǻ�Ͱ� �̰���ϴ�.";
				break;
			default:
				break;
			}
			
			System.out.print("����� = " + player + ", ��ǻ�� = " + str[Ccode] + ", " + result + '\n');
			
		}
		
		
		
		
		
		
		
		scanner.close();

	}

}
