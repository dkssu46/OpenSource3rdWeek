package OpS_3rd;

import java.util.Scanner;

public class RandArray_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �?");
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0 ; i < array.length ; i++) {
			array[i] = (int)(Math.random()*100+1);
		}
		
		
		int k = 0;
		
		for(int j = 0;j < array.length ; j++) {
			k++;
			System.out.print(array[j] + "\t");
			if(k%10 == 0) {
				System.out.println();
			}
		}
		
		//�ߺ��˻� �̽ǽ�
		
		
		scanner.close();

	}

}
