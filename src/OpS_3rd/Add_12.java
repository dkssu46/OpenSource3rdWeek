package OpS_3rd;

public class Add_12 {
	
	public static void main (String[] args) {
		
		int sum = 0;
		int a;
		
		for(int i = 0 ; i < args.length ; i++) {
			try {
				a = Integer.parseInt(args[i]);
			}
			catch (NumberFormatException e) {
				continue;
			}
			sum += a;
		}
		
		
		System.out.println(sum);
		
	}
	
}
