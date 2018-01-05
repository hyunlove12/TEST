package a.jinbub;

public class test {

	public static void main(String[] args) {

		String a = "FF";
		int d = 0;
		int result = 0;
		for (int b = 0; b < a.length(); b++) {
			int c = a.charAt(b);

			if (c < 58 && c > 48) {
				d = (c - 48) * (int) (Math.pow(16, a.length() - 1 - b));

			} else {
				d = (c - 55) * (int) (Math.pow(16, a.length() - 1 - b));

			}
			result += d;
			++result; 

		}

		System.out.println(result);
		
		
		
		
		
		

	}

}
