package OpS_3rd;

import java.util.Scanner;

public class Matching_14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String course [] = {"Java", "C++", "HTML5","컴퓨터구조", "안드로이드"};
		int score[] = {95,88,76,62,55};
		String code = "";
		int num;
		while(!code.equals("그만") ) {
			num = 99;
			System.out.print("과목 이름 >>>");
			code = scanner.next();
			for(int i = 0 ; i < course.length ; i++) {
				if(course[i].equals(code)) {
					num = i;
					break;
				}
			}
			if(num != 99)
				System.out.println(course[num] + "의 점수는" + score[num]);
			else if(code.equals("그만"))
				System.out.println();
			else
				System.out.println("없는 과목입니다.");
			
		}
		
		
		
		
		
		
		
		scanner.close();

	}

}
