package OpS_3rd;

import java.util.Scanner;

public class Matching_14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String course [] = {"Java", "C++", "HTML5","��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95,88,76,62,55};
		String code = "";
		int num;
		while(!code.equals("�׸�") ) {
			num = 99;
			System.out.print("���� �̸� >>>");
			code = scanner.next();
			for(int i = 0 ; i < course.length ; i++) {
				if(course[i].equals(code)) {
					num = i;
					break;
				}
			}
			if(num != 99)
				System.out.println(course[num] + "�� ������" + score[num]);
			else if(code.equals("�׸�"))
				System.out.println();
			else
				System.out.println("���� �����Դϴ�.");
			
		}
		
		
		
		
		
		
		
		scanner.close();

	}

}
