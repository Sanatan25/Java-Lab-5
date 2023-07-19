import java.util.*;
public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int sum = 0;
		int sum2 = 0;
		for(int i = 1; i <= a; i++) {
			sum2+=i;
			sum+=sum2;
		}
		System.out.println(sum);

	}

}
