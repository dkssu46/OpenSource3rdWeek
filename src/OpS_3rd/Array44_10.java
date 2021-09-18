package OpS_3rd;

public class Array44_10 {

	public static void main(String[] args) {
		int[][] array = new int[4][4];
		
		int count = 0;
		
		int m,n;
		while(count < 10) {
			m = (int)(Math.random()*4);
			n = (int)(Math.random()*4);
			
			if(array[m][n] == 0) {
				array[m][n] = (int)(Math.random()*10+1);
				count++;
			}
		}
		
		
		
		
		
		
		
		
		
		
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0 ; j < array[i].length ; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
