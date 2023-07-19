import java.util.*;
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		double sum = 0;
		
		for(int i = 1; i <= a; i++) {
			double result = 1/Math.pow(i, 2);
			sum+= result;
		}
		System.out.println(sum);
	}

}
