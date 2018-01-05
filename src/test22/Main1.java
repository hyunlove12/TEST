package test22;

public class Main1 {

	public static void main(String[] args) {
		fac(4);
		
	}

	public static int fac(int n) {
		if(n<=1) {
			//System.out.printf("n : %d%n", n);
			return n;
		}else {
			System.out.printf("fac(%d-1)*n : %d%n", n, n, fac(n-1)*n);
			return fac(n-1)*n;
		}
	}
}
