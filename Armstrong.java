public class Armstrong{
	public static void main(String[] args)
	{
		int n = 153;
		int temp = n;
		int p = 0;
		
		while (n > 0) {
			int rem = n % 10;
			p = (p) + (rem * rem * rem);
			n = n / 10;
		}
		
		if (temp == p) {
			System.out.println("It is Armstrong Number");
		}
		else {
			System.out.println(
				"It is not an Armstrong Number");
		}
	}
} 